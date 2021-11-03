import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ValidateString {

  final static String TEXT = "      1  2          3         14        5  y  u      6   7              ";
  final static List<String> NUMBERS = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0"));
  final static String CHARACTER_SPECIAL = " ";

  public static void main(String args[]) {

    int result = 0;
    String temp = "";
    boolean isNumber = false;

    for (int index = 0; index < TEXT.length(); index++) {
      String value = String.valueOf(TEXT.charAt(index));
      if (Objects.equals(value, CHARACTER_SPECIAL)) {
        isNumber = false;
      } else if (NUMBERS.contains(value)) {
        isNumber = true;
        temp += value;
        System.out.println("Position: " + (index + 1) + " , Character: " + value + ", Temp: " + temp);
      } else {
        isNumber = false;
        System.out.println("Position: " + (index + 1) + " , Character: " + value + ", it's not a number.");
      }

      if (!isNumber && !temp.isEmpty()) {
        result += Integer.parseInt(temp);
        temp = "";
      }
    }

    System.out.print("Sum: " + result);
  }
}
