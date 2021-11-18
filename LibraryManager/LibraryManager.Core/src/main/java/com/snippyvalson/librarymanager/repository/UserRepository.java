package com.snippyvalson.librarymanager.repository;

import com.snippyvalson.librarymanager.services.storage.UserStorageService;

public class UserRepository {
    private UserStorageService userStorage;

    public UserRepository(UserStorageService userStorageService)
    {
        userStorage = userStorageService;
    }
}
