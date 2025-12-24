package com.example.barter.service.impl;

import com.example.barter.model.BarterTransaction;
import com.example.barter.model.SkillMatch;
import com.example.barter.repository.BarterTransactionRepository;
import com.example.barter.repository.SkillMatchRepository;
import com.example.barter.service.TransactionService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final BarterTransactionRepository transactionRepository;
    private final SkillMatchRepository matchRepository;

    public TransactionServiceImpl(
            BarterTransactionRepository transactionRepository,
            SkillMatchRepository matchRepository) {
        this.transactionRepository = transactionRepository;
        this.matchRepository = matchRepository;
    }

    @Override
    public BarterTransaction createTransaction(Long matchId) {
        SkillMatch match = matchRepository.findById(matchId)
                .orElseThrow(() -> new RuntimeException("Match not found"));

        BarterTransaction tx = new BarterTransaction();
        tx.setMatch(match);
        tx.setStatus("CREATED");
        tx.setCreatedAt(LocalDateTime.now());

        return transactionRepository.save(tx);
    }

    @Override
    public BarterTransaction getTransaction(Long id) {
        return transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));
    }

    @Override
    public List<BarterTransaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
}
