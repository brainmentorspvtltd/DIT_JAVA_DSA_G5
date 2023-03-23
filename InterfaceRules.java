/*
 * IQ - Interface Rules
 */
interface K{
    int MAX = 100; // public static final int MAX = 100;
    void show(); 
}
interface R{
    int MAX = 200; // // public static final int MAX = 200;
    void show();
}
interface H extends K, R {
 void print();
}
class X{

}
class Y2 implements H{

    @Override
    public void show() {
        System.out.println("I am the Y2 Show..."+K.MAX+" "+R.MAX);
    }

    @Override
    public void print() {
        System.out.println("I am the Y2 print...");
    }
    
}
class Y extends X implements K, R{
    @Override
    public void show(){
        System.out.println("I am the Show...");
    }
}
public class InterfaceRules {
    public static void main(String[] args) {
        Y2 y2 = new Y2();
        y2.show();
    }    
}
