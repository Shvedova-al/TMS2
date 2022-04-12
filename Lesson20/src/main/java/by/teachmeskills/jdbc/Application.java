package by.teachmeskills.jdbc;

import by.teachmeskills.jdbc.model.Student;
import by.teachmeskills.jdbc.utils.CRUDUtils;

    public class Application {
        public Application() {
        }

        public static void main(String[] args) {
            Student student = new Student("Ivan", "Ivanov", 5);
            System.out.println("Saved students:");
            System.out.println(CRUDUtils.saveStudent(student));
            System.out.println("---------------------------------------------------");
            System.out.println("All students:");
            System.out.println(CRUDUtils.getAllStudents());
            System.out.println("---------------------------------------------------");
            System.out.println("Updated students:");
            System.out.println(CRUDUtils.updateStudent(1, 3));
            System.out.println("----------------------------------------------------");
            System.out.println("Deleted students: ");
            System.out.println(CRUDUtils.deleteStudent(8));
        }
    }


