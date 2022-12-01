package ru.gb.oseminar3.service;

import ru.gb.oseminar3.data.Student;
import ru.gb.oseminar3.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {

    private final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @Override
    public void createUser(String firstName, String lastName, String patronymic) {
        Long id = 0L;
        for (User user : this.users) {
            if (user instanceof Student) {
                if (id < ((Student) user).getStudentId()) {
                    id = ((Student) user).getStudentId();
                }
            }
        }
        this.users.add(new Student(firstName, lastName, patronymic, ++id));
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void deleteUser(Long id) {
        for (User user : users) {
            if (user instanceof Student){
                if (id.equals(((Student) user).getStudentId())){
                    this.users.remove(user);
                }
            }
        }
    }
}
