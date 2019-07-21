package endpackage;

public class Person  {
    private String name;
    private String phoneNumner;

    public Person(){
      super();
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumner() {
        return phoneNumner;
    }

    public Person(String Cname, String CphoneNumner){
        this.name=Cname;
        this.phoneNumner=CphoneNumner;
    }

    @Override
    public String toString() {
       /* return "Person{" +
                "name='" + name + '\'' +
                ", phoneNumner='" + phoneNumner + '\'' +
                '}';*/
       return  this.phoneNumner+","+this.name;
    }
}
