package com.snippyvalson.librarymanager.services.storage;

import com.snippyvalson.librarymanager.models.User;

import java.util.ArrayList;

public interface UserStorageService {
    ArrayList<User> getAllUsers();
    void add(User item);
    void update(User item);
    void delete(User item);
    void clearAllUsers();
}
