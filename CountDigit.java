public class CountDigit {
    public static void main(String[] args) {
        int num = 72435;
        int count = 0;
        // make a number small till it will be 0 and count the digit
        //num = num/10;
        while(num!=0){
        num/=10;
        count++;
        }
        System.out.println("Count Digit "+count);
    }   
}
