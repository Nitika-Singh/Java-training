public class Company {
    String name;
    long employees;

    //Constructor overloading
    Company(String theName, long theEmployees) {
        name = theName;
        employees = theEmployees;
    }
    Company(long theEmployees, String theName) {
        name = theName;
        employees = theEmployees;
    }
    Company(String theName) {
        name = theName;
    }
    Company() {
        name = "SHELL COMPANY";
        employees = -1;
    }
    Company(long theEmployees) {
        name = "TBA";
        employees = theEmployees;
    }
}
