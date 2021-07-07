package ru.itis;

import ru.itis.models.Course;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class CoursesRepositoryJdbcImpl implements CoursesRepository {

    //language=SQL
    private static final String SQL_SELECT_ALL = "select * from course order by id";

    //language=SQL
    private static final String SQL_SELECT_BY_ID = "select * from course where id = ?";

    //language=SQL
    private static final String SQL_SELECT_ALL_BY_NAME = "select * from course where name = ?";

    //language=SQL
    private static final String SQL_SELECT_ALL_BY_BEGINNING = "select * from course where beginning = ?";

    //language=SQL
    private static final String SQL_SELECT_ALL_BY_ENDING = "select * from course where ending = ?";

    //language=SQL
    private static final String SQL_SELECT_ALL_BY_TEACHER_ID = "select * from course where teacher_id = ?";

    //language=SQL
    private static final String SQL_SELECT_ALL_BY_STUDENT_ID = "select course_id from course_student where student_id = ?";

    //language=SQL
    private static final String SQL_SELECT_ALL_BY_BEGINNING_OR_ENDING = "select * from course where beginning = ? or ending = ?";

    //language=SQL
    private static final String SQL_SELECT_ALL_BY_BEGINNING_AND_ENDING = "select * from course where beginning = ? and ending = ?";

    //language=SQL
    private static final String SQL_SELECT_ALL_BY_TEACHER_ID_OR_STUDENT_ID = "select * from course where teacher_id = ? or id in (select course_id from course_student where student_id = ?)";

    //language=SQL
    private static final String SQL_SELECT_ALL_BY_TEACHER_ID_AND_STUDENT_ID = "select * from course where teacher_id = ? and id in (select course_id from course_student where student_id = ?)";

    //language=SQL
    private static final String SQL_UPDATE_BY_ID = "update course set name = ?, beginning = ?, ending = ?, teacher_id = ? where id = ?";

    //language=SQL
    private static final String SQL_SAVE = "insert into course(name, beginning, ending, teacher_id)  values(?, ?, ?, ?)";

    private DataSource dataSource;

    public CoursesRepositoryJdbcImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private final Function<ResultSet, Course> map = row -> {
        try {
            int id = row.getInt("id");
            String name = row.getString("name");
            String beginning = row.getString("beginning");
            String ending = row.getString("ending");
            int teacher_id = row.getInt("teacher_id");
            CoursesStudentsRepositoryJdbcImpl coursesStudentsRepositoryJdbc = new CoursesStudentsRepositoryJdbcImpl(this.dataSource);
            List<Integer> students_id = coursesStudentsRepositoryJdbc.findStudentsIdByCourseId(id);

            return new Course(id, name, beginning, ending, teacher_id,students_id);
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    };

    @Override
    public List<Course> findAll() {
        List<Course> courses = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet rows = statement.executeQuery(SQL_SELECT_ALL)) {

            while (rows.next()) {
                courses.add(map.apply(rows));
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return courses;
    }

    @Override
    public Optional<Course> findById(Integer id) {
        ResultSet row = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_BY_ID)) {

            statement.setInt(1, id);

            row = statement.executeQuery();

            if (row.next()) {
                return Optional.of(map.apply(row));
            } else {
                return Optional.empty();
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        } finally {
            if (row != null) {
                try {
                    row.close();
                } catch (SQLException ignored) {
                }
            }
        }
    }

    @Override
    public List<Course> findAllByName(String name) {
        List<Course> courses = new ArrayList<>();
        ResultSet rows = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ALL_BY_NAME)) {

            statement.setString(1, name);

            rows = statement.executeQuery();

            while (rows.next()) {
                courses.add(map.apply(rows));
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
        return courses;
    }

    @Override
    public List<Course> findAllByBeginning(String beginning) {
        List<Course> courses = new ArrayList<>();
        ResultSet rows = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ALL_BY_BEGINNING)) {

            statement.setString(1, beginning);

            rows = statement.executeQuery();

            while (rows.next()) {
                courses.add(map.apply(rows));
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
        return courses;
    }

    @Override
    public List<Course> findAllByEnding(String ending) {
        List<Course> courses = new ArrayList<>();
        ResultSet rows = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ALL_BY_ENDING)) {

            statement.setString(1, ending);

            rows = statement.executeQuery();

            while (rows.next()) {
                courses.add(map.apply(rows));
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
        return courses;
    }

    @Override
    public List<Course> findAllByTeacherId(Integer teacher_id) {
        List<Course> courses = new ArrayList<>();
        ResultSet rows = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ALL_BY_TEACHER_ID)) {

            statement.setInt(1, teacher_id);

            rows = statement.executeQuery();

            while (rows.next()) {
                courses.add(map.apply(rows));
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
        return courses;
    }

    @Override
    public List<Course> findAllByStudentId(Integer student_id) {
        List<Course> courses = new ArrayList<>();
        ResultSet rows = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ALL_BY_STUDENT_ID)) {

            statement.setInt(1, student_id);

            rows = statement.executeQuery();

            while (rows.next()) {
                courses.add(map.apply(rows));
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
        return courses;
    }

    @Override
    public List<Course> findAllByStudentsId(List<Integer> students_id) {
        return null;
    }

    @Override
    public List<Course> findAllByBeginningOrEnding(String beginning, String ending) {
        List<Course> courses = new ArrayList<>();
        ResultSet rows = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ALL_BY_BEGINNING_OR_ENDING)) {

            statement.setString(1, beginning);
            statement.setString(2, ending);

            rows = statement.executeQuery();

            while (rows.next()) {
                courses.add(map.apply(rows));
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
        return courses;
    }

    @Override
    public List<Course> findAllByBeginningAndEnding(String beginning, String ending) {
        List<Course> courses = new ArrayList<>();
        ResultSet rows = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ALL_BY_BEGINNING_AND_ENDING)) {

            statement.setString(1, beginning);
            statement.setString(2, ending);

            rows = statement.executeQuery();

            while (rows.next()) {
                courses.add(map.apply(rows));
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
        return courses;
    }

    @Override
    public List<Course> findAllByTeacherIdOrStudentId(Integer teacher_id, Integer student_id) {
        List<Course> courses = new ArrayList<>();
        ResultSet rows = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ALL_BY_TEACHER_ID_OR_STUDENT_ID)) {

            statement.setInt(1, teacher_id);
            statement.setInt(2, student_id);

            rows = statement.executeQuery();

            while (rows.next()) {
                courses.add(map.apply(rows));
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
        return courses;
    }

    @Override
    public List<Course> findAllByTeacherIdAndStudentId(Integer teacher_id, Integer student_id) {
        List<Course> courses = new ArrayList<>();
        ResultSet rows = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ALL_BY_TEACHER_ID_AND_STUDENT_ID)) {

            statement.setInt(1, teacher_id);
            statement.setInt(2, student_id);

            rows = statement.executeQuery();

            while (rows.next()) {
                courses.add(map.apply(rows));
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
        return courses;
    }

    @Override
    public void save(Course course) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_SAVE)) {

            statement.setString(1, course.getName());
            statement.setString(2, course.getBeginning());
            statement.setString(3, course.getEnding());
            statement.setInt(4, course.getTeacher_id());

            statement.executeUpdate();

            CoursesStudentsRepository coursesStudentsRepository = new CoursesStudentsRepositoryJdbcImpl(this.dataSource);
            coursesStudentsRepository.updateStudentsIdByCourseId(course.getStudents_id(), course.getId());

        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public void update(Course course) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_UPDATE_BY_ID)) {

            statement.setString(1, course.getName());
            statement.setString(2, course.getBeginning());
            statement.setString(3, course.getEnding());
            statement.setInt(4, course.getTeacher_id());

            int affectedRows = statement.executeUpdate();

            if (affectedRows != 1) {
                throw new SQLException("Exception in <UpdateCourse>");
            }

            CoursesStudentsRepository coursesStudentsRepository = new CoursesStudentsRepositoryJdbcImpl(this.dataSource);
            coursesStudentsRepository.updateStudentsIdByCourseId(course.getStudents_id(), course.getId());

        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
