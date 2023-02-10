public class Pattern4 {
    public static void main(String[] args) {
        int noOfLines = 5;
        for(int line = noOfLines; line>=1; line-- ){
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
