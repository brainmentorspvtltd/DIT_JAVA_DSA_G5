import java.util.ArrayList;

public class EnhanceForLoop {
    public static void main(String[] args) {
        // Java 5 onwards
       // int age = 21; // Single Value
        int ages [] = {22,20,23,24,25};
        // for(int i = 0 ; i<ages.length; i++){
        //     System.out.println(ages[i]);
        // }
        // for(int age : ages){
        //     System.out.println(age);
        // }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(700);
        for(Integer l : list){
            System.out.println(l);
        }
        list.forEach(w->System.out.println(w));


    }
}
