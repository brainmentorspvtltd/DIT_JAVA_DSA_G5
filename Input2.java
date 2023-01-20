import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) throws Exception {
        // System.out.println("Enter the Name");
        // //byte arr[] =System.in.readAllBytes();
        // int singleByte = System.in.read(); // Single Byte
        // System.out.println("All Bytes "+singleByte);
        // System.out.println("Print Char "+((char)singleByte));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id ");
        int id = scanner.nextInt(); // 1001 \n
        System.out.println("Id is "+id);


        System.out.println("Enter the Name");
        //String name = scanner.next();
        scanner.nextLine(); // eat extra \n
        String name = scanner.nextLine();
        System.out.println("Your Name is "+name);
        
        scanner.close();
    }
}
