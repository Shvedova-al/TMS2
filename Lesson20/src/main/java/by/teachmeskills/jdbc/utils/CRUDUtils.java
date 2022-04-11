package by.teachmeskills.jdbc.utils;

import by.teachmeskills.jdbc.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

    public class CRUDUtils {
        private static final String GET_ALL_STUDENTS_QUERY = "SELECT * FROM students";
        private static final String INSERT_STUDENT_QUERY = "INSERT INTO students(name, surname, course) VALUES(?, ?, ?);";
        private static final String UPDATE_STUDENT_QUERY = "UPDATE students SET course = ? WHERE id = ?;";
        private static final String DELETE_STUDENT_QUERY = "DELETE FROM students WHERE id = ?";

        public CRUDUtils() {
        }

        public static List<Student> getAllStudents() {
            ArrayList students = new ArrayList();

            try {
                Connection connection = DbUtils.getConnection();

                try {
                    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM students");
                    ResultSet rs = preparedStatement.executeQuery();

                    while(rs.next()) {
                        int id = rs.getInt("id");
                        String name = rs.getString("name");
                        String surname = rs.getString("surname");
                        int course = rs.getInt("course");
                        students.add(new Student(id, name, surname, course));
                    }
                } catch (Throwable var9) {
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (Throwable var8) {
                            var9.addSuppressed(var8);
                        }
                    }

                    throw var9;
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException var10) {
                System.out.println(var10.getMessage());
            }

            return students;
        }

        public static List<Student> saveStudent(Student student) {
            Object updatedStudents = new ArrayList();

            try {
                Connection connection = DbUtils.getConnection();

                try {
                    PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO students(name, surname, course) VALUES(?, ?, ?);");
                    preparedStatement.setString(1, student.getName());
                    preparedStatement.setString(2, student.getSurname());
                    preparedStatement.setInt(3, student.getCourse());
                    preparedStatement.executeUpdate();
                    updatedStudents = getAllStudents();
                } catch (Throwable var6) {
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (Throwable var5) {
                            var6.addSuppressed(var5);
                        }
                    }

                    throw var6;
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException var7) {
                System.out.println(var7.getMessage());
            }

            return (List)updatedStudents;
        }

        public static List<Student> updateStudent(int studentId, int course) {
            Object updatedStudents = new ArrayList();

            try {
                Connection connection = DbUtils.getConnection();

                try {
                    PreparedStatement preparedStatement = connection.prepareStatement("UPDATE students SET course = ? WHERE id = ?;");
                    preparedStatement.setInt(1, course);
                    preparedStatement.setInt(2, studentId);
                    preparedStatement.executeUpdate();
                    updatedStudents = getAllStudents();
                } catch (Throwable var7) {
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (Throwable var6) {
                            var7.addSuppressed(var6);
                        }
                    }

                    throw var7;
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException var8) {
                System.out.println(var8.getMessage());
            }

            return (List)updatedStudents;
        }

        public static List<Student> deleteStudent(int studentId) {
            Object updatedStudents = new ArrayList();

            try {
                Connection connection = DbUtils.getConnection();

                try {
                    PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM students WHERE id = ?");
                    preparedStatement.setInt(1, studentId);
                    preparedStatement.execute();
                    updatedStudents = getAllStudents();
                } catch (Throwable var6) {
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (Throwable var5) {
                            var6.addSuppressed(var5);
                        }
                    }

                    throw var6;
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException var7) {
                System.out.println(var7.getMessage());
            }

            return (List)updatedStudents;
        }
    }

