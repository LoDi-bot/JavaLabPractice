package ru.itis;

import ru.itis.models.Course;

import java.util.ArrayList;
import java.util.List;

public interface CoursesStudentsRepository {

    List<Integer> findCoursesIdByStudentId(Integer student_id);

    List<Integer> findAllCoursesIdByStudenstId(List<Integer> students_id);

    List<Integer> findIntersectedCoursesIdByStudenstId(List<Integer> students_id);

    List<Integer> findExceptedCoursesIdByStudenstId(List<Integer> students_id);

    List<Integer> findStudentsIdByCourseId(Integer course_id);

    List<Integer> findAllStudentsIdByCoursesId(List<Integer> courses_id);

    List<Integer> findIntersectedStudentsIdByCoursesId(List<Integer> courses_id);

    List<Integer> findExceptedStudentsIdByCoursesId(List<Integer> courses_id);

    void updateStudentsIdByCourseId(List<Integer> students_id, Integer course_id);

    void insertStudentsIdByCourseId(List<Integer> students_id, Integer course_id);

    void deleteStudentsIdByCourseId(Integer couurse_id);

}
