public class Pattern7 {
    public static void main(String[] args) {
        int noOfLines = 5;
        int totalSpace = noOfLines -1;
        for(int line = 1; line<=noOfLines; line++){
            for(int space = 1; space<=totalSpace; space++){
                System.out.print(" ");
            }
            for(int star = 1; star<=line; star++){
                System.out.print("* ");
            }
            totalSpace--;
            System.out.println();
        }
    }
}
