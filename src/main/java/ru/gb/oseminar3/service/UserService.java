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
    public Student createStudent(String firstName, String lastName, String patronymic) {
        for (User user : this.users) {
            if (user instanceof Student) {
                if (this.userId < ((Student) user).getStudentId()) {
                    this.userId = ((Student) user).getStudentId();
                }
            }
        }
        Student student = new Student(firstName, lastName, patronymic, ++userId);
        this.users.add(student);
        return student;
    }
    public Teacher createTeacher(String firstName, String lastName, String patronymic) {

        for (User user : this.users) {
            if (user instanceof Teacher) {
                if (this.userId < ((Teacher) user).getTeacherId()) {
                    this.userId = ((Teacher) user).getTeacherId();
                }
            }
        }
        Teacher teacher = new Teacher(firstName, lastName, patronymic, ++userId);
        this.users.add(teacher);
        return teacher;
    }

    @Override
    public List<User> getUsers() {
        return this.users;
    }

    @Override
    public List<Student> getStudents() {
        List<Student> studentsList = new ArrayList<>();
        for (User user:this.users) {
            if (user instanceof Student){
                studentsList.add((Student)user);
            }
        }
        return studentsList;
    }

    @Override
    public List<Teacher> getTeachers() {
        List<Teacher> teachersList = new ArrayList<>();
        for (User user:this.users) {
            if (user instanceof Teacher){
                teachersList.add((Teacher)user);
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
