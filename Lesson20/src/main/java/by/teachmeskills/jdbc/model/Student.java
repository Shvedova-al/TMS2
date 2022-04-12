package by.teachmeskills.jdbc.model;

public class Student {
        private int id;
        private String name;
        private String surname;
        private int course;

        public Student(int id, String name, String surname, int course) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.course = course;
        }

        public Student(String name, String surname, int course) {
            this.name = name;
            this.surname = surname;
            this.course = course;
        }

        public int getId() {
            return this.id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return this.surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getCourse() {
            return this.course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        public String toString() {
            return "Student{id=" + this.id + ", name='" + this.name + "', surname='" + this.surname + "', course=" + this.course + "}";
        }
    }


