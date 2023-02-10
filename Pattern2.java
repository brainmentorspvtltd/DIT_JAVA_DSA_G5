public class Pattern2 {
    public static void main(String[] args) {
        int noOfLines = 5;
        for(int line = 1; line<=noOfLines; line++){
            for(int star=1; star<=noOfLines; star++){
                if(line ==1 || line ==noOfLines || star ==1 || star==noOfLines){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
