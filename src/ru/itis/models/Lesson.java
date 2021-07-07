package ru.itis.models;

public class Lesson {
    private Integer id;
    private String name;
    private String day_of_week;
    private String time;
    private Integer course_id;

    public Lesson(Integer id, String name, String day_of_week, String time, Integer course_id) {
        this.id = id;
        this.name = name;
        this.day_of_week = day_of_week;
        this.time = time;
        this.course_id = course_id;
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

    public String getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(String day_of_week) {
        this.day_of_week = day_of_week;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", day_of_week='" + day_of_week + '\'' +
                ", time='" + time + '\'' +
                ", course_id=" + course_id +
                '}';
    }
}
