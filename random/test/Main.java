package test;

import test.InterfaceExampleImpl;

public class Main {
  public static void main(String[] args) {
    InterfaceExample.printMagic("aaaahhh");
    new InterfaceExampleImpl().printMagicN("kkkkk");
//    new AnotherClass().printMagicN("ooooo");
  }
}