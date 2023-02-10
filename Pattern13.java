public class Pattern13 {
    public static void main(String[] args) {
        int noOfLines = 9;
        int mid = noOfLines /2;
        int totalSpace = mid;
        int totalStar = 1;
        for(int line =1; line<=noOfLines; line++){
            for(int space = 1; space<=totalSpace; space++ ){
                System.out.print(" ");
            }
            for(int star = 1; star<=totalStar; star++){
                System.out.print("*");
            }
            if(line <mid){
                totalStar++;
                totalSpace--;

            }
            else{
                totalStar--;
                totalSpace++;
            }
            System.out.println();
        }
    }
}
