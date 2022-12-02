package ru.gb.oseminar3;

import ru.gb.oseminar3.controller.Controller;
import ru.gb.oseminar3.data.Student;
import ru.gb.oseminar3.data.Teacher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Ivan","Ivanov","Ivanovich");
        controller.createStudent("Petr","Petrov","Petrovich");
        controller.createStudent("Alexandr","Alexandrov","Alexandrovich");
        controller.createTeacher("Andrey","Andreev","Andreevich");

        System.out.println("-------------");
        List<Student> studentList = controller.getStudents();
        Teacher teacher = controller.createTeacher("Viktoria","Viktorova","Viktorovna");
        controller.createStudyGroup(teacher,studentList);
    }
}