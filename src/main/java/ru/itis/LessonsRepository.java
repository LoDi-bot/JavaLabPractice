package ru.itis;

import ru.itis.models.Lesson;

import java.util.List;
import java.util.Optional;

public interface LessonsRepository {

    List<Lesson> findAll();

    Optional<Lesson> findById(Integer id);

    List<Lesson> findAllByName(String name);

    void saveLessonReferencedToExistingCourse (Lesson lesson);

    void updateLessonWithReferencedCourse (Lesson lesson);

    void updateLessonWithoutReferencedCourse (Lesson lesson);

    void deleteLessonWithoutReferencedCourse (Lesson lesson);

    void deleteLessonWithReferencedCourse (Lesson lesson);
}
