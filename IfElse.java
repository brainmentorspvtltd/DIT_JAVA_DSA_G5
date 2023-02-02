import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // Greater number b/w 2 numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter the Third Number");
        int thirdNumber = scanner.nextInt();
        // if(firstNumber>secondNumber && firstNumber>thirdNumber){
        //     System.out.println("First Number is Greater");
        // }
        // else if(secondNumber>firstNumber && secondNumber>thirdNumber){
        //     System.out.println("Second Number is Greater");
        // }
        // else{
        //     System.out.println("Third Number is Greater");
        // }
        if(firstNumber>secondNumber){
            if(firstNumber>thirdNumber){
                System.out.println("First Number is Greater");
            }
            else if(thirdNumber>firstNumber){
                System.out.println("Third Number is Greater");
            }
        }
        
        scanner.close();
    }
}
