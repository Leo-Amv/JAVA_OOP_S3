package ru.gb.oseminar3;

import ru.gb.oseminar3.controller.Controller;
import ru.gb.oseminar3.data.Student;
import ru.gb.oseminar3.data.StudyGroup;
import ru.gb.oseminar3.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Ivan","Ivanov","Ivanovich");
        controller.createStudent("Avan","Ivanov","Ivanovich");
        controller.createStudent("Petr","Petrov","Petrovich");
        controller.createStudent("Alexandr","Alexandrov","Alexandrovich");
        List<Student> studentList = controller.getStudents();
        Teacher teacher = controller.createTeacher("Viktoria","Viktorova","Viktorovna");
        StudyGroup studyGroup1 = controller.createStudyGroup(teacher,studentList);
        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(controller.createStudent("Ivo","Ivov","Ivovich"));
        studentList2.add(controller.createStudent("Leo","Alev","Alevich"));
        studentList2.add(controller.createStudent("Oleg","Olegov","Olegovich"));
        Teacher teacher2 = controller.createTeacher("Andrey","Andreev","Andreevich");
        StudyGroup studyGroup2 = controller.createStudyGroup(teacher2,studentList2);
        controller.sortStudyGroup(studyGroup1);
        controller.sortStudyGroup(studyGroup2);
        System.out.println("-------------");
        controller.sendOnConsoleSortStudents(controller.getStudents());
    }
}