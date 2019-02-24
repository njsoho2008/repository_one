package ch8.homework;

public class Staff extends Employee {
    private String acion_title;
    public Staff(){

    }

    public Staff(String name, String address, String telcode, String email, String officehome, double salary, String acion_title) {
        super(name, address, telcode, email, officehome, salary);
        this.acion_title = acion_title;
    }

    public String getAcion_title() {
        return acion_title;
    }

    public void setAcion_title(String acion_title) {
        this.acion_title = acion_title;
    }
    @Override
    public String toString(){
        return "My name is"+this.getName()+",\n"+this.getClass().getName();
    }
}
