package ch8.homework;

public class Student extends Person {
    public static final String Grade1="GradeOne";
    public static final String Grade2="GradeTwo";
    public static final String Grade3="GradeThree";
    public static final String Grade4="GradeFour";

    public Student(){

        super();


    }


    @Override
  public  String   toString(){
        return  this.getName()+","+this.getClass().getName();
    }





}
