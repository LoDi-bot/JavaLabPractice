package ru.itis;

import ru.itis.models.Course;
import ru.itis.models.Student;
import ru.itis.models.Teacher;

import java.util.List;
import java.util.Optional;

public interface CoursesRepository {

    List<Course> findAll();

    Optional<Course> findById(Integer id);

    List<Course> findAllByName(String name);

    List<Course> findAllByBeginning(String beginning);

    List<Course> findAllByEnding(String beginning);

    List<Course> findAllByTeacher(Teacher teacher);

    List<Course> findAllByStudent(Student student);

    List<Course> findAllByBeginningOrEnding(String beginning, String ending);

    List<Course> findAllByBeginningAndEnding(String beginning, String ending);

    List<Course> findAllByTeacherOrStudent(Teacher teacher, Student student);

    List<Course> findAllByTeacherAndStudent(Teacher teacher, Student student);

    void save(Course course);

    void update(Course course);

    void delete(Course course);
}
