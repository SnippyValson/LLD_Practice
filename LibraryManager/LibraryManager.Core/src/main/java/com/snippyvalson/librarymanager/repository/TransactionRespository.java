package com.snippyvalson.librarymanager.repository;

import com.snippyvalson.librarymanager.services.storage.BookTransactionStorageService;
import com.snippyvalson.librarymanager.services.storage.PaymentTransactionStorageService;

public class TransactionRespository {
    private BookTransactionStorageService bookTransactions;
    private PaymentTransactionStorageService paymentTransactions;

    public TransactionRespository(BookTransactionStorageService bookTransactionStorageService, PaymentTransactionStorageService paymentTransactionStorageService)
    {
        bookTransactions = bookTransactionStorageService;
        paymentTransactions = paymentTransactionStorageService;
    }
}
