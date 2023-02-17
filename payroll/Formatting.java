package payroll;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

// Number , Currency , String Formatting
public class Formatting {
    Locale locale = new Locale("fr","FR");
    public String getSystemDate(){
        // For Formatting
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, locale);
        // get the system date
        Date date = new Date();
        return df.format(date);
        //System.out.println();
    }
    public String getFormattedCurrency(double amount){
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(amount);
    }

    public String initCap(String name){
        char singleChar = name.charAt(0);
        String firstCap = String.valueOf(singleChar).toUpperCase();
        String remString = name.substring(1).toLowerCase();
        return firstCap + remString;
    }

    public String getTitleCase(String val){
        // AMit kUMAr sRiVastaVA
        // Amit Kumar Srivastava
        String names[] = val.split("\\s+");
       // System.out.println(names.length);
        
        String fullName = "";
        for(String name : names){
            fullName = fullName + initCap(name) + " ";
        }
        return fullName;
        //return "";
        // names[0] AMit names[1] kUMAr names[2] sRiVastaVA

    }

    public static void main(String[] args) {
        Formatting f = new Formatting();
        //f.getSystemDate();
       // System.out.println("Amount "+f.getFormattedCurrency(1000000.22));
        System.out.println(f.getTitleCase("      AMit         kUMAr sRiVastaVA      ".trim()));
    }
}
