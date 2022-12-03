package ru.gb.oseminar3.controller;

import ru.gb.oseminar3.data.Student;
import ru.gb.oseminar3.data.StudyGroup;
import ru.gb.oseminar3.data.StudyGroupComparator;
import ru.gb.oseminar3.data.Teacher;
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
    private final StudyGroupComparator studyGroupComparator = new StudyGroupComparator();
    public Student createStudent(String firstName, String lastName, String patronymic){
        Student student = userService.createStudent(firstName, lastName, patronymic);
        List<Student> students = userService.getStudents();
        userView.sendOnConsoleStudents(students);
        return student;
    }
    public Teacher createTeacher(String firstName, String lastName, String patronymic){
        Teacher teacher = userService.createTeacher(firstName, lastName, patronymic);
        List<Teacher> teachers = userService.getTeachers();
        userView.sendOnConsoleTeachers(teachers);
        return teacher;
    }
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList){
        StudyGroup studyGroup = studyGroupService.createStudyGroup(teacher,studentList);
        List<StudyGroup> studyGroups = studyGroupService.getStudyGroups();
        studyGroupView.sendOnConsoleStudyGroups(studyGroups);
        return studyGroup;
    }
    public List<Student> getStudents(){
        List<Student> students = userService.getStudents();
        userView.sendOnConsoleStudents(students);
        return students;
    }
    public void sendOnConsoleStudyGroups(){
        List<StudyGroup> studyGroups = studyGroupService.getStudyGroups();
        studyGroupView.sendOnConsoleStudyGroups(studyGroups);
    }
    public void sendOnConsoleSortStudents(List<Student> students){
        students.sort((s1, s2) -> {
            if (s1.getLastName().equalsIgnoreCase(s2.getLastName())){
                return s1.getFirstName().compareTo(s2.getFirstName());
            }
            return s1.getLastName().compareTo(s2.getLastName());
        });
        userView.sendOnConsoleStudents(students);
    }
    public void sortStudyGroup(StudyGroup studyGroup){
        (studyGroup.getStudentList()).sort(studyGroupComparator);
    }
}
