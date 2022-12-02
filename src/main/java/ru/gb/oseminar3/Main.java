package ru.gb.oseminar3;

import ru.gb.oseminar3.controller.Controller;
import ru.gb.oseminar3.data.Student;
import ru.gb.oseminar3.data.Teacher;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Ivan","Ivanov","Ivanovich");
        controller.createStudent("Petr","Petrov","Petrovich");
        controller.createStudent("Alexandr","Alexandrov","Alexandrovich");
        controller.createTeacher("Andrey","Andreev","Andreevich");
        controller.createTeacher("Viktoria","Viktorova","Viktorovna");
        System.out.println("-------------");
        Teacher teacher = new Teacher("Andrey","Andreev","Andreevich",13L);
        List<Student> studentList = Arrays.asList(
                new Student("Ivan","Ivanov","Ivanovich",9L),
                new Student("Petr","Petrov","Petrovich",8L),
                new Student("Alexandr","Alexandrov","Alexandrovich",7L));
        controller.createStudyGroup(teacher,studentList);
    }
}