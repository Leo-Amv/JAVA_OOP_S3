package ru.gb.oseminar3.view;

import ru.gb.oseminar3.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView {
    public void sendOnConsole(List<User> users) {
        Logger log = Logger.getAnonymousLogger();
        for (User user : users) {
            log.info(user.toString());
        }
    }
}
