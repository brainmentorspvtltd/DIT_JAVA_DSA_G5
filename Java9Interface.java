interface MyInterface{
    public abstract void show();
    private static void disp(){
        System.out.println("I am the disp...");
    }
     public default void output(){
        disp();
        System.out.println("I am the Output ....");
    }
}
class W implements MyInterface{

    @Override
    public void show() {
       output();
    }
    
}
public class Java9Interface {
    public static void main(String[] args) {
        new W().show();
    }
}
