package ru.itis;

import ru.itis.models.Course;

import java.util.List;
import java.util.Optional;

public interface CoursesRepository {

    List<Course> findAll();

    Optional<Course> findById(Integer id);

    List<Course> findAllByName(String name);

    List<Course> findAllByBeginning(String beginning);

    List<Course> findAllByEnding(String ending);

    List<Course> findAllByTeacherId(Integer teacher_id);

    List<Course> findAllByStudentId(Integer student_id);

    List<Course> findAllByStudentsId(List<Integer> students_id);

    List<Course> findAllByBeginningOrEnding(String beginning, String ending);

    List<Course> findAllByBeginningAndEnding(String beginning, String ending);

    List<Course> findAllByTeacherIdOrStudentId(Integer teacher_id, Integer student_id);

    List<Course> findAllByTeacherIdAndStudentId(Integer teacher_id, Integer student_id);

    void save(Course course);

    void update(Course course);

    void delete(Course course);
}
