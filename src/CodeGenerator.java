import java.util.Random;

public class CodeGenerator {
    public static void main(String[] args) {
        for (int i=0;i<100;i++)
          System.out.println(getPhoneVerificationCode());
    }

    public static String getPhoneVerificationCode() {
        return String.format("%04d", new Random().nextInt(10000));
    }
}
