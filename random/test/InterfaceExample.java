package test;

public interface InterfaceExample {
  static void printMagic(String str) { // nao pode ser utilizado por subclasses de fora (Subclass.printMagic("aa")
    System.out.println(str);
  }

  default void printMagicN(String str) { // pode ser utilizado por subclasses de fora (new Subclass.printMagicN("11")
    System.out.println(str);
  }

  abstract public void printMagicI(String str);

  void printMagicR(String str);
}