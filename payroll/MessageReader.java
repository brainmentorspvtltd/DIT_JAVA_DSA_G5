package payroll;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageReader {
    Locale locale = new Locale("en","US");
    ResourceBundle rb = ResourceBundle.getBundle("payroll/message",locale );
    public String getMessage(String key){
        return rb.getString(key);
    }
    public static void main(String[] args) {
        MessageReader mr = new MessageReader();
        System.out.println(mr.getMessage("input.id"));
        System.out.println(mr.getMessage("input.name"));
    }
}
