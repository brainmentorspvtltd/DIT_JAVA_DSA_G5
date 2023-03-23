interface J{
    void show(); // public abstract void show();
    default void print(){
        System.out.println("J Print....");
    }
    static void disp(){
        System.out.println("I am the Disp....");
    }
}
interface J1{
    default void print(){
        System.out.println("J1 Print...");
    }
}
class J2 implements J, J1{
    @Override
    public  void print(){
        // Which one to call J or J1
        J.super.print(); 
        J1.super.print();
    }

    @Override
    public void show() {
       System.out.println("Show calling Print...");
       

    }
    
}
public class InterfaceWithJava8 {
    public static void main(String[] args) {
        J.disp();
        J2 obj = new J2();
        //obj.show();
        obj.print();
    }
}
