package com.jpmc;

import java.util.ArrayList;
import java.util.List;

public class ThisKeyword {
    public static void main(String[] args) {
        Student kishore = new Student("Kishore");
        //Course.register(kishore);

        Student nagraj = new Student("Nagaraj");
        //Course.register(nagraj);
    }
}

//this = self
//this refers to the calling object
class Student  {
    private String name;
    public Student(String theName) {
        System.out.println(this);
        //this.name = theName;
        name = theName; //implicitly refers to this.name
        Course.register(this);
    }
}

class Course {
    private static List<Student> students = new ArrayList<>();
    public static void register(Student student) {
        students.add(student);
    }
}