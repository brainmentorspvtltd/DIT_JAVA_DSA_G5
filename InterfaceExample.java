/*
 * IQ - What is Interface and Why we need it?
 * interface - keyword 
 * interface <InterfaceName>
 * What to do?
 * 100 % Abstract + 100% public
 * Abstract Methods + Constants
 */
//abstract interface DBOperations
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
interface DBOperations{
    // Constants
    int MAX = 100; // public static final int MAX = 100;
    // compiler does
    // public abstract int add(String email, String password);
    int add(String email, String password); 
    void read();
    boolean update(String email);
    boolean remove(String email);
}
// Partial Implementation
abstract class Common implements DBOperations{

    @Override
    public int add(String email, String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public boolean update(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

   
    
}
// Using Interface
class OracleDB extends Common {
    // @Override
    // public boolean update(String email){
    //     System.out.println("Oracle Update...");
    //     return true;
    // }

    @Override
    public int add(String email, String password) {
        System.out.println("Oracle Add Call");
        return 1;
    }

    @Override
    public void read() {
       System.out.println("Oracle read...");
    }

    @Override
    public boolean remove(String email) {
        // TODO Auto-generated method stub
        System.out.println("Oracle Remove...");
        return true;
    }
}
class MySQL implements DBOperations{

    @Override
    public int add(String email, String password) {
       System.out.println("MY SQL Add Call");
       return 1;
    }

    @Override
    public void read() {
       System.out.println("MySQL Read...");
    }

    @Override
    public boolean update(String email) {
        // TODO Auto-generated method stub
       System.out.println("MySQL Update ....");
       return true;
    }

    @Override
    public boolean remove(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    
}
public class InterfaceExample {

    static void caller(DBOperations dbOperations){
        dbOperations.add("amit@skillrisers.com","aaaaa");
        dbOperations.read();
        dbOperations.update("amit@skillriser.com");
    }
    public static void main(String[] args) {
        WindowListener l;
        WindowAdapter w;
        caller(new OracleDB());
        caller(new MySQL());
        // OracleDB oracleDB = new OracleDB();
        // oracleDB.add("Amit@skillrisers.com", "hfdjskf");
        // oracleDB.read();

        // MySQL mySQL = new MySQL();
        // mySQL.add("ram@yahoo.com","skillrisers");
        // mySQL.read();
    }
}
