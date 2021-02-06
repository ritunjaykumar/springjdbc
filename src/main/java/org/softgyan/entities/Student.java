package org.softgyan.entities;

public class Student {
    private int id;
    private String student;
    private String city;

    public Student() {
    }

    public Student(int id, String student, String city) {
        this.id = id;
        this.student = student;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\n\tid=" + id +
                "\n\tstudent='" + student + '\'' +
                "\n\tcity='" + city + '\'' +
                "\n}";
    }
}
