/*
 * Can we override the static methods - NO
 * static - it comes when class is loaded.
 */
class Parent{
    // Instance Method
    void show(){
        System.out.println("I am the Parent Show...");
    }
    static void print(){
        System.out.println("I am the Parent Print....");
    }
}
class Child extends Parent{
    int x; // Instance Variable / Lazy
    static int y; // Class variable / Eager
    Child(){
        x++;
        y++;
        System.out.println("X is "+x+" and  Y is "+y);
    }
    // Runtime Polym
    @Override
    void show(){
        System.out.println("I am the Child Show...");
    }
   
    static void print(){
        System.out.println("I am the Child Print....");
    }
}
public class StaticMethods {
    public static void main(String[] args) {
        //Child.print();
        Parent child = new Child(); // Upcasting
       child.show();
      child.print();
    }
}
