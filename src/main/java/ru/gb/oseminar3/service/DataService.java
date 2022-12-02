package ru.gb.oseminar3.service;

import ru.gb.oseminar3.data.Student;
import ru.gb.oseminar3.data.Teacher;
import ru.gb.oseminar3.data.User;

import java.util.List;

public interface DataService {
    Student createStudent(String firstName, String lastName, String patronymic);
    Teacher createTeacher(String firstName, String lastName, String patronymic);
    List<User> getUsers();
    List<Student> getStudents();
    List<Teacher> getTeachers();
    void deleteUser(Long id);
}
