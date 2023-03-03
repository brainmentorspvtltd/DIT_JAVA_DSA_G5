/*
 * Polymorphism via Overriding
 */
/*
 * Overriding 
 * 1. Inheritance / ISA / Parent  - Child Relationship
 * Rule : Method Signature of Child should be match with Parent method.
 * So Parent method will be hide when u override in a child.
 * Advantage:
 * Code Resuse
 * Overriding - Polymorphism
 */
/*
 * Overloading - Same method but arguments are different
 * 1. Number of Arguments can be different
 * 2. Type of Arguments can be different
 * 3. Order of Arguments can be different
 */
class A2{
    void show(){
        System.out.println("A2 Show...");
    }
    void show(int x){
        System.out.println("A2 One Argument Show..");
    }
}
class B2 extends A2{
    @Override
    void show(){
        System.out.println("B2 Show...");
    }
    void show(int x, int y){
        System.out.println("B2 2 Arguments Show...");
    }
}
class OverloadingExample{
    String show(int x){
        System.out.println("Show X");
        return "String";
    }
    int show(int x, int y){
        System.out.println("Show X and Y");
        return x + y;
    }
    void show(double x, double y){
        System.out.println("Show double x and y");
    }
    void show(int x , String y){
        System.out.println("Show int and String");
    }
    void show(String x, int y){
        System.out.println("Show String and int");
    }
}
class Loan{ // Act as a Parent Class
    Object emi(){
        System.out.println("LOAN CLASS ::: ROI of EMI is 8%");
        return new Object();
    }
    void applyForLoan(){
        System.out.println("LOAN CLASS ::: Apply For Loan");
    }
}
class HomeLoan extends Loan{ // Act as a Child Class
    @Override
    Object emi(){
        super.emi();
        System.out.println("HomeLoan ::: ROI of EMI is 9.5% ");
        //return new Object();
        return new String(); // Covariant / Sub types
    }
    void insurance(){
        System.out.println("HomeLoan :: Apply for Insurance...");
    }
}
public class Overriding {
    public static void main(String[] args) {
    //    //Loan homeLoan = new HomeLoan(); // Upcasting
    //    HomeLoan homeLoan = new HomeLoan();
    //     homeLoan.applyForLoan();
    //     homeLoan.emi();
        //homeLoan.insurance();
        B2 obj = new B2();
        obj.show();
        obj.show(1);
        obj.show(1,2);
        // OverloadingExample  eg = new OverloadingExample();
        // eg.show(1);
        // eg.show(10,20);
        // eg.show(100.20,90.20);
        // eg.show("Amit",22);

    }
}
