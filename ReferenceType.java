public class ReferenceType {
    public static void main(String[] args) {
        String name = "Amit"; // String Literal
        /*
         * String is a predefine class
         * String contains collection of chars or Array of chars
         * and name is just a variable
         * name is going to store the reference of Amit
         */
        String name2 = name; // name reference is copied into name2
        String name3 = new String("Amit"); 
        // new is a keyword it allocate a new (Fresh ) Memory for Amit
        System.out.println(name == name2); // true Reference Compare
        System.out.println(name == name3); // false
    }
}
