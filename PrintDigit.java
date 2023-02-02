import java.util.Scanner;

public class PrintDigit {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        int num = new Scanner(System.in).nextInt();
        //int num = 12345;
        int copy = num;
        int count = 0;
        // // Print 5 4 3 2 1
        // while(num!=0){
        // System.out.println(num%10); // Last Digit
        // num/=10; // make the number small
        // }

        // Print 1 2 3 4 5
        // Count Digit
        while(copy!=0){
            copy/=10;
            count++;

        }
       // System.out.println("Count "+count);
        int power = (int)Math.pow(10, count-1);
        //System.out.println("Power is "+power);
        while(num!=0){
            System.out.println(num/power); // Get the Digit
            num = num % power; // Make Number Small
            power = power /10;
        }
    }
}
