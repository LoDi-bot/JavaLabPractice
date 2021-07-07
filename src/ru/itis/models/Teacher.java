package ru.itis.models;

import java.util.ArrayList;

public class Teacher {
    private Integer id;
    private String first_name;
    private String las_name;
    private Integer experience;
    private ArrayList<Integer> courses_id;

    public Teacher(Integer id, String first_name, String las_name, Integer experiene, ArrayList<Integer> courses_id) {
        this.id = id;
        this.first_name = first_name;
        this.las_name = las_name;
        this.experience = experiene;
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

    public Integer getExperiene() {
        return experience;
    }

    public void setExperiene(Integer experiene) {
        this.experience = experiene;
    }

    public ArrayList<Integer> getCourses_id() {
        return courses_id;
    }

    public void setCourses_id(ArrayList<Integer> courses_id) {
        this.courses_id = courses_id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", las_name='" + las_name + '\'' +
                ", experiene=" + experience +
                ", courses_id=" + courses_id.toString() +
                '}';
    }
}
