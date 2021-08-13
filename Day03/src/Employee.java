public class Employee {
    private String employeeId;
    private String name;
    private long salary;

    public Employee(String theEmployeeId, String theName, long theSalary) {
        employeeId = theEmployeeId;
        name = theName;
        salary = theSalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long value) {
        if(value > 10000) {
            salary = value;
        }
    }

    public void work(int hours) {
        System.out.println(name + " is working " + hours + " hours");
    }

}
