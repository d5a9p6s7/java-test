public class StringTest {

  public static void main(java.lang.String args[]) {

    java.lang.String test = "image.profile.png";
    System.out.println("length: " + test.length());
    System.out.println("last index of: " + test.lastIndexOf('.'));
    System.out.println("ext: " + getExt(test));
  }

  private static String getExt(final String fileName){
    return fileName.substring(fileName.lastIndexOf('.'));
  }
}
