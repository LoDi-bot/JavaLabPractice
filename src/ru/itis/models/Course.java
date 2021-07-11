package ru.itis.models;

import java.util.List;

public class Course {
    private Integer id;
    private String name;
    private String beginning;
    private String ending;
    private Teacher teacher;
    private List<Student> students;

    public Course(Integer id, String name, String beginning, String ending, Teacher teacher, List<Student> students) {
        this.id = id;
        this.name = name;
        this.beginning = beginning;
        this.ending = ending;
        this.teacher = teacher;
        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeginning() {
        return beginning;
    }

    public void setBeginning(String beginning) {
        this.beginning = beginning;
    }

    public String getEnding() {
        return ending;
    }

    public void setEnding(String ending) {
        this.ending = ending;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents_id(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", beginning='" + beginning + '\'' +
                ", ending='" + ending + '\'' +
                ", teacher_id=" + teacher +
                ", student_id=" + students.toString() +
                '}';
    }
}
