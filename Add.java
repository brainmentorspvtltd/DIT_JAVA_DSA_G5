public class Add {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i<args.length; i++){
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("Sum is "+sum);
        /*int firstNumber = Integer.parseInt(args[0]); // String convert into int
        int secondNumber = Integer.parseInt(args[1]);
        int result = firstNumber + secondNumber;
        System.out.println("Result is "+result);
        */
    }
}
