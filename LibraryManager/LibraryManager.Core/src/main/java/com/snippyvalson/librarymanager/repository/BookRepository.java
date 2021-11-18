package com.snippyvalson.librarymanager.repository;

import com.snippyvalson.librarymanager.services.storage.BookStorageService;

public class BookRepository {
    private  BookStorageService bookStorage;

    public BookRepository(BookStorageService bookStorageService)
    {
        bookStorage = bookStorageService;
    }
}
