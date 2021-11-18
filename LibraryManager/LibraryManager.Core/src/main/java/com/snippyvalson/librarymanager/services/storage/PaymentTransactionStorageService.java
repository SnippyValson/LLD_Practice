package com.snippyvalson.librarymanager.services.storage;

import com.snippyvalson.librarymanager.models.PaymentTransaction;

import java.util.ArrayList;

public interface PaymentTransactionStorageService {
    ArrayList<PaymentTransaction> getAllPaymentTransactions();
    void addTransaction(PaymentTransaction transaction);
    void updateTransaction(PaymentTransaction transaction);
    void deleteTransaction(PaymentTransaction transaction);
    void clearAllPayments();
}
