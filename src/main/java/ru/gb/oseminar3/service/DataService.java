package ru.gb.oseminar3.service;

import ru.gb.oseminar3.data.User;

import java.util.List;

public interface DataService {
    void createUser(String firstName, String lastName, String patronymic);
    List<User> getAll();
    void deleteUser(Long id);
}
