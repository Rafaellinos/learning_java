public class Main {

  public static void main(String[] args) {

    try (AutoClosebleExample autoClosebleExample = new AutoClosebleExample()) {
      System.out.println(autoClosebleExample.invertString("rafael"));
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
