import java.util.LinkedList;

public class Wrapper {
    public static void main(String[] args) {
        int x = 10; // int literal
        byte y = (byte) x; // TypeCasting (Explicit)
        Integer y2 = 20; // Integer Literal
        // Type Conversion Method
        byte z = y2.byteValue(); // xxxValue()
        long t = y2.longValue();
        int f = Integer.parseInt("999"); // String convert into int
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(10));
        float r2 = 90.20f;
        Float tt = 90.20f; 
        Character cc = 'A';
        Boolean r4 = true;

        LinkedList<Integer> l = new LinkedList<>();
        l.add(100);
        l.add(200);
        l.add(300);
        System.out.println(l);
       


    }
}
