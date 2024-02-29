package org.example;

public class AbstractImpl extends Abstract {
  @Override
  public void printMagico(String str) {
    String rc = sanitizarDocumento(str);
  }
}
