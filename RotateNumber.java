public class RotateNumber {
    public static void main(String[] args) {
        int num = 12345;
        int rotations = -2;
        int copy = num;
        int countDigit = 0;
        // Step-1 Count Digit 
        while(copy!=0){
            countDigit++;
            copy/=10;
        }
        rotations = rotations % countDigit;
        if(rotations<0){
            rotations = rotations + countDigit;
        }
        int power = (int)Math.pow(10,rotations);
        int leftPart = num/power;
        int rightPart  = num % power;
        int rem = countDigit - rotations;
        power = (int)Math.pow(10,rem);
        int result = rightPart * power + leftPart;
        System.out.println(result);

    }
}
