public strictfp class JavaBasics {
    //static public strictfp void main(String ...arguments) {
        static public  void main(String ...arguments) {
        System.out.println("This Main Understand by JVM");
        // It is a Local Variable (Define inside a method main)
        // Local Variable has to be initalize first before use
        // Local Variable there no concept of Garbage Collection
        byte age; // 1 Byte of Information Store (-128 to 127)Range
        age = 30;
        //age = age + 1;
        age++;
        int id = 1001;
        long voterid = 1234556632344l; // long literal
        System.out.println("Age is "+age);
        float roi = 9.7f;  // f is for Float Literal
        roi = 10.2F;
        roi = (float) 11.2; // Explict Typecasting

        double amount = 10000.2345;
        //int age;
        // age is a name of a variable
        // int is a data type
        //main();
        // char - used to store single char (2 Byte Info) (Unicode)
        char agree = 'Y';
        System.out.println("Agree "+agree);
        char hindi = 'न';
        System.out.println("Lang "+hindi);
        boolean isPresent = true; // Internally 0 or 1 (1 Byte or 2 Byte) Depend OS
            
    }
    static public  void main() {
        System.out.println("User Define Main...");
    }

}
