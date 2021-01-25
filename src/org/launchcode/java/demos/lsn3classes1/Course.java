package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {

    //Create it with 3 fields: name, students in class, credits for class
    private String name;
    private ArrayList<Student> studentRoster;
    private int creditsForClass;

    @Override
    public String toString() {
        return "Course " +
                "name='" + name + '\'' +
                ", studentRoster=" + studentRoster +
                ", creditsForClass=" + creditsForClass +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return creditsForClass == course.creditsForClass && name.equals(course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creditsForClass);
    }
}
