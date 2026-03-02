package org.example;

public abstract class Characters {
    private String gender;
    private String name;
    private int age;
    private String contactNumber;

    public Characters(String gender, String name, int age, String contactNumber) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public abstract void printDetails();
}
