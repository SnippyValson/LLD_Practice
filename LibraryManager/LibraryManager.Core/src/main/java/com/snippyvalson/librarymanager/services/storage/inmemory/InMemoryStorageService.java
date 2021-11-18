package com.snippyvalson.librarymanager.services.storage.inmemory;

import com.snippyvalson.librarymanager.models.Book;
import com.snippyvalson.librarymanager.models.BookTransaction;
import com.snippyvalson.librarymanager.models.PaymentTransaction;
import com.snippyvalson.librarymanager.models.User;
import com.snippyvalson.librarymanager.services.storage.StorageService;

import java.util.ArrayList;

public class InMemoryStorageService implements StorageService {
    @Override
    public ArrayList<Book> getAllBooks() {
        return null;
    }

    @Override
    public void add(Book item) {

    }

    @Override
    public void update(Book item) {

    }

    @Override
    public void delete(Book item) {

    }

    @Override
    public void clearAllBooks() {

    }

    @Override
    public ArrayList<BookTransaction> getAllBookTransactions() {
        return null;
    }

    @Override
    public void add(BookTransaction transaction) {

    }

    @Override
    public void update(BookTransaction transaction) {

    }

    @Override
    public void delete(BookTransaction transaction) {

    }

    @Override
    public ArrayList<PaymentTransaction> getAllPaymentTransactions() {
        return null;
    }

    @Override
    public void addTransaction(PaymentTransaction transaction) {

    }

    @Override
    public void updateTransaction(PaymentTransaction transaction) {

    }

    @Override
    public void deleteTransaction(PaymentTransaction transaction) {

    }

    @Override
    public void clearAllPayments() {

    }

    @Override
    public ArrayList<User> getAllUsers() {
        return null;
    }

    @Override
    public void add(User item) {

    }

    @Override
    public void update(User item) {

    }

    @Override
    public void delete(User item) {

    }

    @Override
    public void clearAllUsers() {

    }
}
