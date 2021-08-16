package com.jpmc.inheritance;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee empSam = new Employee(8678, "Sam");
        empSam.work(8);

        Manager mgrRam = new Manager(78687, "Ram", 10000);
        mgrRam.work(10);
    }
}
