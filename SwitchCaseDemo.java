import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        // Constants (byte, int , char, String (JAva 7))
        // final int PIZZA = 1;
        // final int BURGER = 2; // ALL CAPS Constants (Standard)
        // final int DRINKS = 3;
        // final int DESSERTS = 4;
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Drinks");
        System.out.println("4. Desserts");
        System.out.println("Enter the Choice");
        //int choice = new Scanner(System.in).nextInt();
        String choice = new Scanner(System.in).next().toLowerCase();
        
        switch(choice){
           case "pizza":
            // case PIZZA:
            //case 1 : // choice == 1
            System.out.println("Price is Rs 300");
            break; // exit from the switch
            case "burger":
            //case BURGER:
            //case 2: // choice ==2
            System.out.println("Price is Rs 100");
            break; 
            case "drinks":
            //case DRINKS:
            //case 3:
            System.out.println("Price is Rs 80");
            break; 
            case "desserts":
            //case DESSERTS:
            //case 4:
            System.out.println("Price is Rs 200");
            break; 
            default:
            System.out.println("Wrong Choice...");
        }

    }
}
