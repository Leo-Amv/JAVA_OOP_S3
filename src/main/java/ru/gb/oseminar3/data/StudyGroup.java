package ru.gb.oseminar3.data;

import java.util.List;

public class StudyGroup {
    private Long studyGroupId;
    public Teacher teacher;
    public List<Student> studentList;

    public StudyGroup(Teacher teacher, List<Student> studentList, Long studyGroupId) {
        this.teacher = teacher;
        this.studentList = studentList;
        this.studyGroupId = studyGroupId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Long getStudyGroupId() {
        return studyGroupId;
    }

    public void setStudyGroupId(Long studyGroupId) {
        this.studyGroupId = studyGroupId;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }
}
