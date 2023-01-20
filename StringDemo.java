public class StringDemo {
    public static void main(String[] args) {
        /*
         *  String store in a String Pool.
         * String Pool is a part of a Heap Memory
         * Heap is a Memory to store the objects 
         * String are Immutable (Can't be Modified the Org Value), if change it, It create fresh Memory
            String objects created in 2 style
            a) String Literal
            b) String new String
         */
        String name = "Amit"; // String Literal (1 Object or 0 Object)
        // Check these String is already exist in a String Pool
        String name2 = "Amit";
        System.out.println(name == name2); // Reference Same
        name2 = "AMIT"; // New Memory
        System.out.println(name == name2); // false
        String name3 = new String("Amit"); // 2 or 1 object
        System.out.println(name == name3); // false
        String name4 = new String("Ram");
        String name5 = "Ram"; 
        System.out.println("Ram "+(name4 == name5)); // False

        // String value compare
        System.out.println("******************************");
        System.out.println(name.equals(name3)); // Value Compare
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name5.compareTo(name));

    }
}
