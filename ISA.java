/*
 * IS A RelationShip Example
 * Parent - Child Based RelationShip
 */
// final class - can't be inherit...
//final class Account{
    class Account{
    int a = 20;
    final int Y ; // final (constant) + Instance Var 
    int id;
    String name;
    double balance;
    // default constructor
    Account(){
        Y = 10000; // final instance variables can be initalize in constructor
        System.out.println("Account class default constructor");
        id = 1;
        name = "Amit";
        balance = 1111;
    }
    Account(int y){
        this.Y = y;
        //this(); // Own class default const call
        System.out.println("Account Class Param Cons Call....");
    }
    void withDraw(){
        System.out.println("Account WithDraw...");
    }
    void deposit(){
        System.out.println("Account Deposit...");
    }
    final void checkBalance(){ 
        // final with method - prevent overrriding
        System.out.println("Account CheckBalance...");
    }
    void roi(){
        System.out.println("Account Roi is 3% ...");
    }
}
// extends - keyword (ISA) Parent - child (Inheritance)
class SavingAccount extends Account{
    int a = 10;
    // @Override
    // void checkBalance(){

    // }
    SavingAccount(){
        // this is optional to write , Implicit constrcutor call
        //super(); // through super will call parent constructor (Default constrcutor)
        super(10); // parent param cons call
        System.out.println("Saving Account default constructor call...");
    }
    SavingAccount(int x){
         // super();
       //  super(10);
        // super or this constructor call must be in a first line.
      
        this(); // MY class default constructor call
        System.out.println(this.a  + super.a);
        System.out.println("I am the Saving Account Param const...");
    }
    void noOfTransLimit(){
        System.out.println("15 Trans Per day...");
    }
    // parent and child method signature is same - overriding
    // when u do overriding so parent feature / method will be hide.
    @Override
    void roi(){
        super.roi(); // keyword - it has reference of parent
        System.out.println("Saving ROI 4%");
    }
}
class CurrentAccount extends Account{
    void odLimit(){
        System.out.println("OD Limit Rs 20000");
    }
}
public class ISA {
    public static void main(String[] args) {
        // final - fixed thing / freezed
        final int MAX = 100; // 1. Constant
       // MAX = 10000;
       // MAX++;
        final SavingAccount sa = new SavingAccount(10);
        sa.a=10000;
        //sa = new SavingAccount();
        sa.withDraw();
        sa.deposit();
        sa.roi();
        sa.noOfTransLimit();
        System.out.println("****************");
        CurrentAccount ca = new CurrentAccount();
        ca.withDraw();
        ca.deposit();
        ca.roi();
        ca.odLimit();
    }
}
