public class Pattern8 {
    public static void main(String[] args) {
        int noOfLines = 7;
        int totalSpace = noOfLines-1;
        for(int line = 0; line<=noOfLines-1; line++){
            for(int space = 1; space<=totalSpace ; space++){
                System.out.print(" ");
            }
            int oddCompute = 2 * line + 1;
            for(int star = 1; star<=oddCompute; star++){
                System.out.print("*");
            }
            totalSpace--;
            System.out.println();
        }
    }
}
