

public class TestEmployee {
    public static void main(String[] args) {
       // String x = new String("Ram");
        //System.out.println(x.toString());
       // Employee amit =new Employee();
        Employee amit = new Employee(1010, "Amit",3333);
        amit.setSalary(amit.getSalary() + 10000);
        System.out.println(amit); // amit.toString()
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
        System.out.println("**********************");
        //Employee shashi = new Employee();
        Employee shashi = new Employee(1002, "Shashi",66666);
        System.out.println(shashi);
        //shashi.takeInput(1002, "Shashi" ,999999);
       // shashi.printEmployee();
        // System.out.println(shashi.id);
        // System.out.println(shashi.name);
        // System.out.println(shashi.salary);
        // System.out.println(shashi);
        // System.out.println(shashi.hashCode());
    }
}
