package model;

public class Student {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String classes;

    public Student() {
    }

    public Student(String name, String address, String phone, String classes) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.classes = classes;
    }

    public Student(int id, String name, String address, String phone, String classes) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
