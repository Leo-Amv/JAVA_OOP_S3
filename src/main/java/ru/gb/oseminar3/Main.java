package ru.gb.oseminar3;

import ru.gb.oseminar3.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createUser("Ivan","Ivanov","Ivanovich");
    }
}