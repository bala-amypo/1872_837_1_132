package com.example.demo.controller;

import com.example.demo.model.BarterTransaction;
import com.example.demo.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    // CREATE transaction
    @PostMapping
    public ResponseEntity<BarterTransaction> createTransaction(
            @RequestBody BarterTransaction transaction) {

        return ResponseEntity.ok(
                transactionService.createTransaction(transaction)
        );
    }

    // GET transaction by ID
    @GetMapping("/{id}")
    public ResponseEntity<BarterTransaction> getTransaction(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                transactionService.getTransactionById(id)
        );
    }

    // GET all transactions
    @GetMapping
    public ResponseEntity<List<BarterTransaction>> getAllTransactions() {
        return ResponseEntity.ok(
                transactionService.getAllTransactions()
        );
    }
}
