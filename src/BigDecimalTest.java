import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {

  public static void main(String args[]) {
    BigDecimal amount = new BigDecimal(15569.899999999999636202119290828704833984375).setScale(0, RoundingMode.HALF_UP);

    System.out.print(amount);
  }
}
