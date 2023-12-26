public class AutoClosebleExample implements AutoCloseable {

  private final StringBuilder invertedString;

  public AutoClosebleExample() {
    invertedString = new StringBuilder();
  }

  public String invertString(String someString) {
    return new StringBuilder(someString).reverse().toString();
//    char[] charArray = someString.toCharArray();
//    int length = charArray.length -1;
//    while (length >= 0) {
//      invertedString.append(charArray[length]);
//      length -= 1;
//    }
//    return invertedString.toString();
  }

  @Override
  public void close() throws Exception {
    System.out.println("closing...");
  }
}
