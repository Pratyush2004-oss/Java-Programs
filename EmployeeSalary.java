import java.util.Scanner;

class Employee{
    int Salary;
    String name;
    public void getSalary(){
        System.out.println("Employee Salary : " + Salary);
    }
    public int setSalary(int Salary){
        this.Salary = Salary;
        return Salary;
    }
    public void getName(){
        System.out.println("Name of the employee is : " + name);
    }

    public String Setname(String name){
        this.name=name;
        return name;
    }
}

public class EmployeeSalary {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String nm = scan.nextLine();
        System.out.print("Enter Salary : ");
        int sal = scan.nextInt();
        Employee e1 = new Employee();
        e1.Setname(nm);
        e1.setSalary(sal);
        e1.getName();
        e1.getSalary();
        
    }
}
