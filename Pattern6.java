public class Pattern6 {
    public static void main(String[] args) {
        int noOfLines = 5;
        int spaceTotal = 0;
        for(int line = noOfLines; line>=1; line--){
            for(int space = 1; space<=spaceTotal; space++){
                System.out.print(" ");
            }
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            spaceTotal++;
            System.out.println();
        }
    }
}
