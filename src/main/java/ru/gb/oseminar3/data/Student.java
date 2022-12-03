package ru.gb.oseminar3.data;

public class Student extends User {
    private Long studentId;
    private Long studyGroupId = 0L;
    public Student(String firstName, String lastName, String patronymic,Long studentId) {
        super(firstName, lastName, patronymic);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getStudyGroupId() {
        return studyGroupId;
    }

    public void setStudyGroupId(Long studyGroupId) {
        this.studyGroupId = studyGroupId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", patronymic='" + this.getPatronymic() + '\'' +
                ", studentId='" + studentId + '\'' +
                ", studyGroupId='" + studyGroupId + '\'' +
                '}';
    }
}
