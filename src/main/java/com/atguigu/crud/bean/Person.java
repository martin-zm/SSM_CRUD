package com.atguigu.crud.bean;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String deptName;

    public Person() {

    }

    public Person(String firstName, String lastName, int age, String deptName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.deptName = deptName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
