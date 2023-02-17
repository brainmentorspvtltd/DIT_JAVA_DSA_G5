package payroll.caller;
import java.util.Scanner;

import payroll.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Id ");
        int id = scanner.nextInt();
        System.out.println("Enter the Name");
        String name = scanner.next();
        System.out.println("Enter the Salary");
        double salary = scanner.nextDouble();
       // String x = new String("Ram");
        //System.out.println(x.toString());
       // Employee amit =new Employee();
        Employee amit = new Employee(id , name, salary);
        amit.setSalary(amit.getSalary() + 10000);
        System.out.println(amit); // amit.toString()
        scanner.close();
        //amit.Employee();
        // amit.id = -1001;
        // amit.name = "amit";
        // amit.salary = -9999;
       // amit.takeInput(-1001, "Amit" ,-99999);
        //amit.printEmployee();
        // System.out.println(amit.id); //200.id
        // System.out.println(amit.name);
        // System.out.println(amit.salary);
        // System.out.println(amit);
        // System.out.println(amit.toString()); // amit.toString();
        // System.out.println(amit.hashCode());

        // R.H.S new Employee() Object Creation
        // System.out.println("**********************");
        // //Employee shashi = new Employee();
        // Employee shashi = new Employee(1002, "Shashi",66666);
        // System.out.println(shashi);
        //shashi.takeInput(1002, "Shashi" ,999999);
       // shashi.printEmployee();
        // System.out.println(shashi.id);
        // System.out.println(shashi.name);
        // System.out.println(shashi.salary);
        // System.out.println(shashi);
        // System.out.println(shashi.hashCode());
    }
}
