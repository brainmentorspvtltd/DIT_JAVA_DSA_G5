/*
 * enum is a special type from Java 5 onwards
 * It can represent group of constants
 */
enum FoodItems{
    PIZZA, BURGER, DRINKS, DESSERTS
}
// enum syntax is same as class syntax
public class EnumDemo {
    public static void main(String[] args) {
        FoodItems choice = FoodItems.BURGER;
        System.out.println("Choice is "+choice);
        System.out.println("Internal Value "+choice.ordinal());
        switch(choice){
            case PIZZA: // This time ENUM VALUE will be compare
            System.out.println("Price is Rs 300");
            break;
            case BURGER:
            System.out.println("Price is Rs 100");
            break;
            case DRINKS:
            System.out.println("Price is Rs 80");
            break;
            case DESSERTS:
            System.out.println("Price is Rs 200");
            break;
            default:
            System.out.println("Wrong Choice...");
        }
    }
}
