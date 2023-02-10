public class Pattern10 {
    public static void main(String[] args) {
        int noOfLines = 7;
        int leftSpace = noOfLines-1;
        int rightSpace = 0;
        for(int line = 1; line<=noOfLines; line++){
            for(int space = 1; space<=leftSpace; space++){
                System.out.print(" ");
            }
            System.out.print("* ");
            leftSpace--;
            for(int space = 1; space<=rightSpace; space++){
                System.out.print(" ");
            }
            rightSpace++;
            System.out.println();
        }
    }
}
