package ru.gb.oseminar3.service;

import ru.gb.oseminar3.data.Student;
import ru.gb.oseminar3.data.StudyGroup;
import ru.gb.oseminar3.data.Teacher;
import ru.gb.oseminar3.data.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    public List<User> createStudyGroup(Teacher teacher, List<Student> studentList){
        StudyGroup studyGroup = new StudyGroup(teacher,studentList);
        List<User> result = new ArrayList<>();
        result.add(studyGroup.teacher);
        result.addAll(studyGroup.studentList);
        return result;
    }
}
