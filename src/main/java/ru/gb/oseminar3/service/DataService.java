package ru.gb.oseminar3.service;

import ru.gb.oseminar3.data.User;

import java.util.List;

public interface DataService {
    void createStudent(String firstName, String lastName, String patronymic);
    void createTeacher(String firstName, String lastName, String patronymic);
    List<User> getUsers();
    List<User> getStudents();
    List<User> getTeachers();
    void deleteUser(Long id);
}
