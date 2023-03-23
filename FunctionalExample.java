import java.util.ArrayList;

/*
 * IQ- What is Java Lambda Expression? Why we need it?
 */
@FunctionalInterface
interface Calc{
   // void show();
   default void show(){
    System.out.println("I am the Show....");
   }
    int compute(int x, int y); // public abstract int compute (int x, int y);
}
public class FunctionalExample {
    public static void main(String[] args) {
       // int arr[] = {10,20,30};
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.stream().filter((x)->x>20).forEach((x)->System.out.println(x));
        // forEach
        //l.forEach((x)->System.out.println(x));
        // Enhance for loop
        // for(Integer i : l ){
        //     System.out.println(i);
        // }
        // for(int i = 0 ; i<l.size(); i++){
        //     System.out.println(l.get(i));
       // }
        // Calc c = (a,b)->a+b;
        // System.out.println(c.compute(10, 2));
        // Calc c2 = (a,b)->{
        //     System.out.println("A is "+a+" and B is "+b);
        //     return a * b;
        // };
        // System.out.println(c2.compute(10, 2));

    }
}
