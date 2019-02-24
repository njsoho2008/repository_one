package ch8.homework;

public class Person {
    private String name;
    private String address;
    private String telcode;
    private String email;
    public Person(){

    }

    public Person(String name, String address, String telcode, String email) {
        this.name = name;
        this.address = address;
        this.telcode = telcode;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelcode() {
        return telcode;
    }

    public void setTelcode(String telcode) {
        this.telcode = telcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        /*return "My name is "+this.getName()+", My Home Address is"+this.getAddress()+"," +
                "\n"+"My telcode is "+this.getTelcode();*/

        return "My name is "+this.getName()+","+this.getClass().getName();
    }
}
