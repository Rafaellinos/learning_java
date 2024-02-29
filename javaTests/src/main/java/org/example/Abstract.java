package org.example;

public abstract class Abstract {
  public abstract void printMagico(String str);

  protected String sanitizarDocumento(String documento) {
    return documento.replaceAll("[.-]", "");
  }
}
