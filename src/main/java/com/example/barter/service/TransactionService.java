package com.example.barter.service;

import com.example.barter.model.BarterTransaction;
import java.util.List;

public interface TransactionService {

    BarterTransaction createTransaction(BarterTransaction transaction);

    BarterTransaction getTransactionById(Long id);

    List<BarterTransaction> getAllTransactions();
}
