package com.jpmc;

public class StaticOrShared {
    public static void main(String[] args) {
//        Employee sam = new Employee("Sam");
        Employee ram = new Employee("Ram");
//        Employee mary = new Employee("Mary");
        System.out.println(Employee.company);
        System.out.println(Employee.getCompany());
        System.out.println(ram.getCompany()); //NOT RECOMMENDED AT ALL
    }
}

class Employee {
    private String name;
    public static String company;

    //static initializer block or static constructors
    static {
        company = "JPMC";
    }

    public static String getCompany() {
        return company;
    }

    public Employee(String name) {
        this.name = name;
    }
}

