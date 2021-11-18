package com.snippyvalson.librarymanager.services.storage;

import com.snippyvalson.librarymanager.models.BookTransaction;

import java.util.ArrayList;

public interface BookTransactionStorageService {
    ArrayList<BookTransaction> getAllBookTransactions();
    void add(BookTransaction transaction);
    void update(BookTransaction transaction);
    void delete(BookTransaction transaction);
    void clearAllPayments();
}
