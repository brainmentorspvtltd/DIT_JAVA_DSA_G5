import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the Number");
        num = new Scanner(System.in).nextInt();
        int reverseNumber = 0;
        while(num!=0){
            int lastDigit = num % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            num = num/10;
        }
        System.out.println(reverseNumber);

    }
}
