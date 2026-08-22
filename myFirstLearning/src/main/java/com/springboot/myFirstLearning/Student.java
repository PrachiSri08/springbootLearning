package com.springboot.myFirstLearning;

public class Student {
    int id;
    String name;
    String course;
    String branch;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getBranch() {
        return branch;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
