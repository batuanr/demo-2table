package model;

public class Student {
    private int id;
    private String name;
    private Address address;
    private String phone;
    private Classes classes;

    public Student() {
    }

    public Student(String name, Address address, String phone, Classes classes) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.classes = classes;
    }

    public Student(int id, String name, Address address, String phone, Classes classes) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.classes = classes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}
