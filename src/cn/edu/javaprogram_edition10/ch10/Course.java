package cn.edu.javaprogram_edition10.ch10;

public class Course {
    private String course_name;
    private String[] students = new String[50];
    private int numberOfStudent;

    public Course() {
        this.course_name = "Java 程序设计";
    }

    public Course(String course_name) {
        this.course_name = course_name;
    }


    public String getCourse_name() {
        return course_name;
    }

    public void addStudent(String student_name) {
        students[numberOfStudent] = student_name;
        numberOfStudent++;

    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void dropStudent(String student_name) {
        //3月27日作业 p342也10.9
        int j = 0;
        for (int i = 0; i < students.length; i++) {
            if (student_name == students[i]) {
                j = i;
            }
        }
        for (int k = j + 1; k < students.length; k++) {
            students[k - 1] = students[k];

            students[students.length - 1] = "";
        }

        numberOfStudent--;

    }

    public String[] getStudents() {
        return students;

    }

}
