public class GCD {
    public static void main(String[] args) {
        int x = 48;
        int y = 40;

        // Simple Way
        // int min = Math.min(x,y);
        // int min = x<y?x:y;
        // while(min!=0){
        //     if(x%min ==0 && y % min ==0){
        //         System.out.println("GCD "+min);
        //         return ;
        //     }
        //     min--;
        // }

        // Approach-2 Subtraction Method
        // while(x!=y){
        //     if(x>y){
        //         x = x -y;
        //     }
        //     else{
        //         y = y-x;
        //     }
        // }
        // System.out.println("GCD "+x);

        // Approach-3 Divisior Method
        while(x%y!=0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        System.out.println("GCD "+y);

    }
}
