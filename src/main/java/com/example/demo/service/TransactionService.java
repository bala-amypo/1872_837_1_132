package com.example.demo.service;

import com.example.demo.model.BarterTransaction;
import java.util.List;

public interface TransactionService {

    BarterTransaction createTransaction(BarterTransaction transaction);

    BarterTransaction getTransactionById(Long id);

    List<BarterTransaction> getAllTransactions();
}
