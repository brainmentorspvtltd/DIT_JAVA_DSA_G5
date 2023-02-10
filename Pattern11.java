public class Pattern11 {
    public static void main(String[] args) {
        int noOfLines = 5;
        for(int line = 0 ; line<noOfLines; line++){
            for(int star = 0 ; star<noOfLines; star++){
                if(line == star || (line + star)==noOfLines-1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
