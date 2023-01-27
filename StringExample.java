public class StringExample {
    public static void main(String[] args) {
        String a = "Amit".intern(); // String a = "Amit".intern(); 
        String b = "Amit";
        System.out.println("Same Ref "+(a==b));
        String c = new String("Amit");
        System.out.println("Same Ref "+(a==c));
        System.out.println("Value Compare "+(a.equals(c)));
        b = "Ram";
        System.out.println("Compare A and B Ref "+(a==b));
    }
}
