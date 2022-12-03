package ru.gb.oseminar3.data;

public class Student extends User {
    private Long studentId;

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

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", patronymic='" + this.getPatronymic() + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
