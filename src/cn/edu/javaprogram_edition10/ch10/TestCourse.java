package cn.edu.javaprogram_edition10.ch10;

public class TestCourse {
    public static void main(String[] args){
        Course course1=new Course();
        Course course2=new Course("军事理论");
       course1.addStudent("李云");
       course1.addStudent("王芳");
       course1.addStudent("雷锋");


       course2.addStudent("韩航");
       course2.addStudent("刘亦菲");
       course2.addStudent("王菲");
       course2.addStudent("王思聪");
       course2.addStudent("马云");
       String[] students_course1=course1.getStudents();
       String[] students_course2=course2.getStudents();
       for(int i=0;i<course1.getNumberOfStudent();i++) {
           System.out.println("选择" + course1.getCourse_name() + "这门课的人有:" + students_course1[i] + " ,");
       }
       System.out.println("----------------------------------------------");
        for(int i=0;i<course2.getNumberOfStudent();i++) {
            System.out.println("选择" + course2.getCourse_name() + "这门课的人有:" + students_course2[i] + " ,");
        }
        course2.dropStudent("王菲");
        String[] students_course2_new=course2.getStudents();

        System.out.println("----------------------------------------------");
        for(int i=0;i<course2.getNumberOfStudent();i++) {
            System.out.println("选择" + course2.getCourse_name() + "这门课的人有:" + students_course2_new[i] + " ,");
        }


    }

}
