package ru.itis;

import ru.itis.models.Course;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CoursesStudentsRepositoryJdbcImpl implements CoursesStudentsRepository {

    //language=SQL
    private static final String SQL_SELECT_ALL_STUDENTS_ID_BY_COURSE_ID = "select student_id from course_student where course_id = ?";

    //language=SQL
    private static final String SQL_SELECT_ALL_COURSES_ID_BY_STUDENT_ID = "select course_id from course_student where student_id = ?";

    //language=SQL
    private static final String SQL_INSERT_STUDENT_ID_BY_COURSE_ID = "insert into course_student values (? , ?)";

    //language=SQL
    private static final String SQL_DELETE_STUDENTS_ID_BY_COURSE_ID = "delete from course_student where course_id = ?";

    private final DataSource dataSource;

    public CoursesStudentsRepositoryJdbcImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Integer> findCoursesIdByStudentId(Integer student_id) {
        List<Integer> courses_id = new ArrayList<>();
        ResultSet rows = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ALL_COURSES_ID_BY_STUDENT_ID)) {

            statement.setInt(1, student_id);

            rows = statement.executeQuery();

            while (rows.next()) {
                courses_id.add(rows.getInt("course_id"));
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        } finally {
            if (rows != null) {
                try {
                    rows.close();
                } catch (SQLException ignored) {
                }
            }
        }
        return courses_id;
    }

    @Override
    public List<Integer> findAllCoursesIdByStudenstId(List<Integer> students_id) {
        return null;
    }

    @Override
    public List<Integer> findIntersectedCoursesIdByStudenstId(List<Integer> students_id) {
        return null;
    }

    @Override
    public List<Integer> findExceptedCoursesIdByStudenstId(List<Integer> students_id) {
        return null;
    }

    @Override
    public List<Integer> findStudentsIdByCourseId(Integer course_id) {
        List<Integer> students_id = new ArrayList<>();
        ResultSet rows = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ALL_STUDENTS_ID_BY_COURSE_ID)) {

            statement.setInt(1, course_id);

            rows = statement.executeQuery();

            while (rows.next()) {
                students_id.add(rows.getInt("student_id"));
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        } finally {
            if (rows != null) {
                try {
                    rows.close();
                } catch (SQLException ignored) {
                }
            }
        }
        return students_id;
    }

    @Override
    public List<Integer> findAllStudentsIdByCoursesId(List<Integer> courses_id) {
        return null;
    }

    @Override
    public List<Integer> findIntersectedStudentsIdByCoursesId(List<Integer> courses_id) {
        return null;
    }

    @Override
    public List<Integer> findExceptedStudentsIdByCoursesId(List<Integer> courses_id) {
        return null;
    }

    @Override
    public void updateStudentsIdByCourseId(List<Integer> students_id, Integer course_id) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement insertionStatement = connection.prepareStatement(SQL_INSERT_STUDENT_ID_BY_COURSE_ID);
             PreparedStatement deletionStatement = connection.prepareStatement(SQL_DELETE_STUDENTS_ID_BY_COURSE_ID)) {

            deletionStatement.setInt(1, course_id);
            deletionStatement.executeUpdate();

            insertionStatement.setInt(1, course_id);
            students_id.forEach(student_id -> {
                try {
                    insertionStatement.setInt(2, student_id);
                    insertionStatement.executeUpdate();
                } catch (SQLException ignored) {}
            });
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public void insertStudentsIdByCourseId(List<Integer> students_id, Integer course_id) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_INSERT_STUDENT_ID_BY_COURSE_ID)) {

            statement.setInt(1, course_id);

            students_id.forEach(student_id -> {
                try {
                    statement.setInt(2, student_id);
                    statement.executeUpdate();
                } catch (SQLException ignored) {}
            });
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public void deleteStudentsIdByCourseId(Integer course_id) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_DELETE_STUDENTS_ID_BY_COURSE_ID)) {

            statement.setInt(1, course_id);

            int affectedRows = statement.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

}
