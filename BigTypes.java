import java.math.BigDecimal;
import java.math.BigInteger;

public class BigTypes {
    public static void main(String[] args) {
        BigInteger first = new BigInteger("1111232433434534544534");
        BigInteger second = new BigInteger("645543543534543545");
        BigInteger third = first.add(second);
        System.out.println(third);
        BigDecimal v = new BigDecimal("5435345345435.2212");
    }
}
