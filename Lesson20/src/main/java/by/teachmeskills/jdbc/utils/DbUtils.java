package by.teachmeskills.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class DbUtils {
        private static String dbUrl = "jdbc:mysql://localhost:3306/STUDENTS_DB";
        private static String dbUsername = "root";
        private static String dbPassword = "12345";

        public DbUtils() {
        }

        public static Connection getConnection() {
            Connection connection = null;

            try {
                connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            } catch (SQLException var2) {
                var2.printStackTrace();
            }

            return connection;
        }
    }


