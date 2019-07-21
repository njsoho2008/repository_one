package endpackage;

public class Student extends Person {
    private String classname;
    public Student(){
        super();
    }
    public Student(String Cname,String CphoneNumber,String CclassName){
        super(Cname,CphoneNumber);
        this.classname=CclassName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classname='" + classname + '\'' +
                "name="+super.getName() +'\'' +
                "phoneNumber="+super.getPhoneNumner()  +
                '}';
    }
}
