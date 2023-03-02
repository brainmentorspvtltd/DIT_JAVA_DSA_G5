/*
 * Constructor vs Method
 * 1. Constructor name must be same as  class name , but method name can be anything.
   2. Constructor is used to initlize the instance variables , method for logic. 
   3. Constructor doesn't have return type , but method need specify return type or use void.
   4. Constructor call implicitly during the object creation, but method need to be called explicity
    5. static can't be used with constructor ,  constructor is used to initialize the instance variables initalize when u create an object
    method can have static 
    6. every class has default constructor by default , compiler will provide it
    no default method is provided by the compiler for method.
   */
  class K{
    //K(){}
    // K(int x){

    // }
  }
class T{
    int x, y; // INstance Variables
     T(){
        x =10; // Instance Variable get initalize here.
        y = 20;
        System.out.println("I am the Constructor...");
    }

    static void disp(){

    }
    void T(){
        System.out.println("I am the Method...");
    }
    void show(){
        // Logic 
        System.out.println("I am the Method..");
    }
}
public class ConstructorVsMethod {
    public static void main(String[] args) {
        K obj2 = new K(); // calling a default constructor
        T obj = new T(); // Constructor will be call during the object creation.
        obj.T();
        //obj.show(); // Explicit call
    }
}
