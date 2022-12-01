package ru.gb.oseminar3.controller;

import ru.gb.oseminar3.data.Student;
import ru.gb.oseminar3.data.Teacher;
import ru.gb.oseminar3.data.User;
import ru.gb.oseminar3.service.StudyGroupService;
import ru.gb.oseminar3.service.UserService;
import ru.gb.oseminar3.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    public void createUser(String firstName, String lastName, String patronymic){
        userService.createUser(firstName, lastName, patronymic);
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }
    public void createStudyGroup(Long teacherId, List<Long> studentsId){
        Teacher teacher = new Teacher("","","",0L);
        List<Student>studentList = new ArrayList<>();
        for (User user: userService.getAll()) {
            if (user instanceof Teacher){
                if (teacherId.equals(((Teacher) user).getTeacherId())){
                     teacher = (Teacher) user;
                }
            } else if (user instanceof Student) {
                for (Long studentId:studentsId) {
                    if (studentId.equals(((Student) user).getStudentId())){
                        studentList.add((Student) user);
                    }
                }
            }
        }

        List<User> users = studyGroupService.createStudyGroup(teacher,studentList);
        studentView.sendOnConsole(users);
    }
}
