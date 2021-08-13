public class EmployeeUser {
    public static void main(String[] args) {
        Employee sam
                = new Employee("emp101",
                "Sam", 10000);
        //Uncontrolled access to members
        //sam.employeeId = null;
        //sam.salary = 394783478;
        sam.work(8);
        System.out.println(sam.getName());
        System.out.println(sam.getEmployeeId());

        //sam.salary = -1;
        sam.setSalary(-1);
        System.out.println(sam.getSalary());
    }
}
