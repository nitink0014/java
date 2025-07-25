package nitin;

public class testEmployee {

    public static void main(String[] args) {
        Employee emp = new Employee("Nitin" ,21,250000);
        System.out.println(emp.EmployeeDetails());
        emp.setAge(22);
        System.out.println(emp.EmployeeDetails());
    }
}
