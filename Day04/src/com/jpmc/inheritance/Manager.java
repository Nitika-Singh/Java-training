package com.jpmc.inheritance;

public class Manager extends Employee {
    private long salary;

    public Manager(long id, String name, long salary) {
        super(id, name); //MANDATORY
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    //Overriding the super class function
    //Should have the same signature as the base class method
    public void work(int hours) {
        System.out.println("Manager " + getName() + " is in planning meetings for " +  hours + " hours");
    }
}
