package ru.itis.models;

import java.util.ArrayList;

public class Student {
    private Integer id;
    private String first_name;
    private String las_name;
    private Integer group_id;
    private ArrayList<Integer> courses_id;

    public Student(Integer id, String first_name, String las_name, Integer group_id, ArrayList<Integer> courses_id) {
        this.id = id;
        this.first_name = first_name;
        this.las_name = las_name;
        this.group_id = group_id;
        this.courses_id = courses_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLas_name() {
        return las_name;
    }

    public void setLas_name(String las_name) {
        this.las_name = las_name;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public ArrayList<Integer> getCourses_id() {
        return courses_id;
    }

    public void setCourses_id(ArrayList<Integer> courses_id) {
        this.courses_id = courses_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", las_name='" + las_name + '\'' +
                ", group_id=" + group_id +
                ", courses_id=" + courses_id.toString() +
                '}';
    }
}
