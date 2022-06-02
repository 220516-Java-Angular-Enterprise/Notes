package com.revature.streams;

public class Employee {
    private String id;
    private String firstname;
    private String lastname;
    private int age;
    private Gender gender;

    public Employee() {

    }

    public Employee(String id, String firstname, String lastname, int age, Gender gender) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Firstname: " + firstname + ", Lastname: " + lastname + ", Age: " + age + ", Gender: " + gender;
    }
}
