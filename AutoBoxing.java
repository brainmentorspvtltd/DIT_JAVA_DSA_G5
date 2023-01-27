public class AutoBoxing {
    public static void main(String[] args) {
        //Integer t = 128;
        Integer a = 128;
        //Integer a = Integer.valueOf(10);
        // Integer a = new Integer(10); // Boxing
        // Integer b =new Integer(20); // Boxing
        //System.out.println(t == a);
        Integer b = 20;
        Integer c = a + b;
        //Integer c = new Integer(a.intValue() + b.intValue()); // intValue () UnBoxing
        System.out.println(c);
        // int x = 10;
        // int y = 20;
        // int z = x + y;
        // System.out.println(z);
    }
}
