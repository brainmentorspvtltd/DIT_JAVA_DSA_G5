public class Mutable {
    public static void main(String[] args) {
         String type = "shoe";
        // String DYNAMIC_SQL = "select * from product where type="+type;
        // double price = 3000;
        // DYNAMIC_SQL = DYNAMIC_SQL + " and price= "+price;
       
        // int size = 9;
        // DYNAMIC_SQL = DYNAMIC_SQL + " and size="+size;
        // System.out.println(DYNAMIC_SQL);
        StringBuilder sb = new StringBuilder(); // Java 1.5
        synchronized(sb){
            sb.ensureCapacity(1000);
        }
        //StringBuffer sb  = new StringBuffer("select * from product");
       
        System.out.println("Cap "+sb.capacity());
        System.out.println("Len "+sb.length());
        sb.append(" where type =").append(type);
        System.out.println(sb);
        System.out.println("Cap "+sb.capacity());
        System.out.println("Len "+sb.length());
        sb.append("gjkdfhgjkd gjhdfjkhgdkfhghkdfghkjdfhgkjhdfgkjhdfkjghfdkjghkjdfhgkjdfhgkjdfhkgjghfkdjhghfdkjghfd gjdhfgjkhdf ghdfkjh gfdhkjgd gdfhkjgd gdfhkjgfd gdfhkjgdf gdfhkj");
        //sb.insert(1, "AAA");
        System.out.println("Cap "+sb.capacity());
        System.out.println("Len "+sb.length());
        sb.append("Ok");
        System.out.println("Cap "+sb.capacity());
        System.out.println("Len "+sb.length());
    }
}
