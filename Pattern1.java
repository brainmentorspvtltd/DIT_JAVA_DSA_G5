class Pattern1 {
    public static void main(String[] args) {
        int noOfLines = 10;
        // Print Lines
        // OUter Loop
        for(int line = 1; line<=noOfLines; line++){
            // Inner Loop
            for(int star = 1; star<=noOfLines; star++){
                System.out.print("* ");
            }
            System.out.println(); // new line print (\n)
        }

    }
}