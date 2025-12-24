package com.example.barter.service.impl;

import com.example.barter.model.BarterTransaction;
import com.example.barter.repository.BarterTransactionRepository;
import com.example.barter.service.TransactionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final BarterTransactionRepository repository;

    public TransactionServiceImpl(BarterTransactionRepository repository) {
        this.repository = repository;
    }

    @Override
    public BarterTransaction createTransaction(BarterTransaction transaction) {
        return repository.save(transaction);
    }

    @Override
    public BarterTransaction getTransactionById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<BarterTransaction> getAllTransactions() {
        return repository.findAll();
    }
}
