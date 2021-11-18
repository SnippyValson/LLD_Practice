package com.snippyvalson.librarymanager.services.storage;
import com.snippyvalson.librarymanager.models.Book;

import java.util.ArrayList;

/**
 * The book storage service allows the CRUD operation on the persisted book information.
 */
public interface BookStorageService {
    ArrayList<Book> getAllBooks();
    void add(Book item);
    void update(Book item);
    void delete(Book item);
    void clearAllBooks();
}
