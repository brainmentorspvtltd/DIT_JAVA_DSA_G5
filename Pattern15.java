public class Pattern15 {
    public static void main(String[] args) {
        int noOfLines = 4;
        int ascii = 65;
        for(int line = 1; line<=noOfLines; line++, ascii++){
            for(int col = 1; col<=line; col++){
                System.out.print((char)ascii);
                //ascii++;
            }
            System.out.println();
        }
    }
}
