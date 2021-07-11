package ru.itis.models;

import java.util.List;

public class Teacher {
    private Integer id;
    private String first_name;
    private String las_name;
    private Integer experience;
    private List<Course> courses;

    public Teacher(Integer id, String first_name, String las_name, Integer experiene, List<Course> courses) {
        this.id = id;
        this.first_name = first_name;
        this.las_name = las_name;
        this.experience = experiene;
        this.courses = courses;
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

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", las_name='" + las_name + '\'' +
                ", experiene=" + experience +
                ", courses_id=" + courses.toString() +
                '}';
    }
}
