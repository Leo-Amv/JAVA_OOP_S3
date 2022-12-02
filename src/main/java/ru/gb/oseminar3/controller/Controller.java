package ru.gb.oseminar3.controller;

import ru.gb.oseminar3.data.Student;
import ru.gb.oseminar3.data.StudyGroup;
import ru.gb.oseminar3.data.Teacher;
import ru.gb.oseminar3.data.User;
import ru.gb.oseminar3.service.StudyGroupService;
import ru.gb.oseminar3.service.UserService;
import ru.gb.oseminar3.view.StudyGroupView;
import ru.gb.oseminar3.view.UserView;

import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final UserView userView = new UserView();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StudyGroupView studyGroupView = new StudyGroupView();
    public void createStudent(String firstName, String lastName, String patronymic){
        userService.createStudent(firstName, lastName, patronymic);
        List<User> students = userService.getStudents();
        userView.sendOnConsoleStudents(students);
    }
    public void createTeacher(String firstName, String lastName, String patronymic){
        userService.createStudent(firstName, lastName, patronymic);
        List<User> teachers = userService.getTeachers();
        userView.sendOnConsoleTeachers(teachers);
    }
    public void createStudyGroup(Teacher teacher, List<Student> studentList){
        studyGroupService.createStudyGroup(teacher,studentList);
        List<StudyGroup> studyGroups = studyGroupService.getStudyGroups();
        studyGroupView.sendOnConsoleStudyGroups(studyGroups);
    }
}
