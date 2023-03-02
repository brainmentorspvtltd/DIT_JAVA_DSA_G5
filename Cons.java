/*
 * final vs finalize vs finally
 */
// final class P1
 class P1 extends Object{
    final int a; // Instance Var + final
    final int b = 21000;
    P1(){
        a = 100;
    }
    P1(int a){
        this(); 
        //this.a = a;
    }
    final void show(){
        System.out.println("I am Show..");
    }
}
class C1 extends P1{
    

    // void show(){
    //     System.out.println("I am ANother Show..");
    // }
    C1(){
        System.out.println("C1 Welcome...");
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Good Bye Object...");
    }
}

public class Cons {
    public static void main(String[] args) {

        try{
            // DB Connect
            // DB Trans - Success
                // Exception Might be raised
        }
        catch(Exception e){
            // Handling, Exception Treat Here
        }
        finally{
            // Always Execute Block
            // Resource Clean up code
            // DB Connection Close
        }

        C1 obj = new C1(); // Object Create + Constructor 
       final int MAX = 100; //Local + final
       obj = null; // No Reference 
       System.gc(); // Hey GC When ever u have just run..
       for(int i = 1; i<=10; i++){
        System.out.println("Main Loop "+i);
       }
       // GC - Claim Object
      // MAX ++; 
    }
}
