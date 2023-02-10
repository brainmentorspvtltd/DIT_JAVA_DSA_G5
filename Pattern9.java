public class Pattern9 {
    public static void main(String[] args) {
        int noOfLines = 8;
        int mid = noOfLines/2;
        int totalSpace = mid;
        int starCount = 1;
        for(int line = 1; line<=noOfLines; line++){
            for(int space = 1; space<=totalSpace; space++){
                System.out.print(" ");
            }
            for(int star = 1; star<=starCount; star++){
                System.out.print("*");
            }
            if(line<mid){ // Upper Pyramid
                starCount+=2;
                totalSpace--;
            }
            else{ // Lower Pyramid
                starCount-=2;
                totalSpace++;
            }
            System.out.println();
        }
    }
}
