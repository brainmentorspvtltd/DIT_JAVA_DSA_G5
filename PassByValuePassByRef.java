/*
 * Pass By Value vs Pass By Reference
 */
class Emp{
    int id;
    String name;
    double salary;
}
public class PassByValuePassByRef {

    void show(Emp emp){
        emp.salary = emp.salary + 10000;
        System.out.println("Inside Show::: Salary is "+emp.salary);
    }

    int add(int x, int y){
        x = x + 10;
        y = y + 20;
        System.out.println("X is "+x+" and Y is "+y);
        return x + y;
    }
    public static void main(String[] args) {
        PassByValuePassByRef obj = new PassByValuePassByRef();
        // Pass By Ref
        Emp employee = new Emp();
        employee.id = 1001;
        employee.name = "Amit";
        employee.salary = 99999;
        obj.show(employee);
        System.out.println("After Show ::: Now Updated Salary is "+employee.salary);
        // Pass by Value
        // int a = 10;
        // int b = 20;
        // int r = obj.add(a, b);
        // System.out.println("A is "+a + " and b is "+b);
        // System.out.println("Result is "+r);
        
        
    }
}
