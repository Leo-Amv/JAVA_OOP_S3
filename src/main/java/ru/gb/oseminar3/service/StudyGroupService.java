package ru.gb.oseminar3.service;

import ru.gb.oseminar3.data.Student;
import ru.gb.oseminar3.data.StudyGroup;
import ru.gb.oseminar3.data.Teacher;
import ru.gb.oseminar3.data.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    private final List<StudyGroup> studyGroups;
    private Long studyGroupId = 0L;

    public StudyGroupService() {
        this.studyGroups = new ArrayList<>();
    }

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList){
        StudyGroup studyGroup = new StudyGroup(teacher,studentList,++studyGroupId);
        this.studyGroups.add(studyGroup);
        for (Student student:studentList) {
            student.setStudyGroupId(studyGroup.getStudyGroupId());
        }
        return studyGroup;
    }

    public List<StudyGroup> getStudyGroups() {
        return this.studyGroups;
    }
    public void deleteStudyGroup(Long studyGroupId){
        this.studyGroups.removeIf(studyGroup -> studyGroupId.equals(studyGroup.getStudyGroupId()));
    }
}
