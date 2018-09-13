package com.vaibhav.interview;

/**
 * Created by vaibh on 9/12/2018.
 */

/*
 * Create the Student and Priorities classes here.
 */
public class Student {
    private String Name;
    private int id;
    private double CGPA;

    Student(int id,  String name, double cgpa) {
        this.Name = name;
        this.id = id;
        this.CGPA = cgpa;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.Name;
    }

    public double getCGPA() {
        return this.CGPA;
    }
}
