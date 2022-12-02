package ru.gb.oseminar3.view;

import ru.gb.oseminar3.data.Student;
import ru.gb.oseminar3.data.Teacher;
import ru.gb.oseminar3.data.User;

import java.util.List;
import java.util.logging.Logger;

public class UserView {
    public void sendOnConsoleStudents(List<Student> users) {
        Logger log = Logger.getAnonymousLogger();
        for (User user : users) {
            if (user instanceof Student){
                log.info(user.toString());
            }
        }
    }
    public void sendOnConsoleTeachers(List<Teacher> users) {
        Logger log = Logger.getAnonymousLogger();
        for (User user : users) {
            if (user instanceof Teacher){
                log.info(user.toString());
            }
        }
    }
    public void sendOnConsoleUsers(List<User> users) {
        Logger log = Logger.getAnonymousLogger();
        for (User user : users) {
                log.info(user.toString());
        }
    }
}
