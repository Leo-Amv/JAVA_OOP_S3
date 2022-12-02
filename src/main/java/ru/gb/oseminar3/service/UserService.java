package ru.gb.oseminar3.service;

import ru.gb.oseminar3.data.Student;
import ru.gb.oseminar3.data.Teacher;
import ru.gb.oseminar3.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {
    private Long userId = 0L;

    private final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @Override
    public void createStudent(String firstName, String lastName, String patronymic) {
        for (User user : this.users) {
            if (user instanceof Student) {
                if (this.userId < ((Student) user).getStudentId()) {
                    this.userId = ((Student) user).getStudentId();
                }
            }
        }
        this.users.add(new Student(firstName, lastName, patronymic, ++userId));
    }
    public void createTeacher(String firstName, String lastName, String patronymic) {

        for (User user : this.users) {
            if (user instanceof Teacher) {
                if (this.userId < ((Teacher) user).getTeacherId()) {
                    this.userId = ((Teacher) user).getTeacherId();
                }
            }
        }
        this.users.add(new Teacher(firstName, lastName, patronymic, ++userId));
    }

    @Override
    public List<User> getUsers() {
        return this.users;
    }

    @Override
    public List<User> getStudents() {
        List<User> studentsList = new ArrayList<>();
        for (User user:this.users) {
            if (user instanceof Student){
                studentsList.add(user);
            }
        }
        return studentsList;
    }

    @Override
    public List<User> getTeachers() {
        List<User> teachersList = new ArrayList<>();
        for (User user:this.users) {
            if (user instanceof Teacher){
                teachersList.add(user);
            }
        }
        return teachersList;
    }


    @Override
    public void deleteUser(Long id) {
        for (User user : users) {
            if (user instanceof Student){
                if (id.equals(((Student) user).getStudentId())){
                    this.users.remove(user);
                }
            }else if (user instanceof Teacher){
                if (id.equals(((Teacher) user).getTeacherId())){
                    this.users.remove(user);
                }
            }
        }
    }
}
