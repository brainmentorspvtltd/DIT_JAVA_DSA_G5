public class Pattern12 {
    public static void main(String[] args) {
        int noOfLines = 9;
        int mid = noOfLines/2;
        int totalStar = 1;
        for(int line = 1; line<=noOfLines; line++){
            for(int star = 1; star<=totalStar; star++){
                System.out.print("*");
            }
            if(line<mid){
                totalStar++;
            }
            else{
                totalStar--;
            }
            System.out.println();
        }
    }
}
