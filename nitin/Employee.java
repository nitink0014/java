package nitin;

public class Employee {
    private String Name;
    private int Age;
    private int Salary;

    Employee(String Name, int Age, int Salary){

        this.Name = Name;
        this.Age=Age;
        this.Salary = Salary;
    }
    String EmployeeDetails(){

        return "Employee Details :" +"Name :"+ Name +" Age :"+ Age +" Salary :"+Salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
