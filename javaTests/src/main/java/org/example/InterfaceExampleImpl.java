package org.example;

import org.example.InterfaceExample;

import java.util.HashMap;
import java.util.Map;

public class InterfaceExampleImpl implements InterfaceExample {

  private FormaPagamentoEnum formaPagamentoEnum;

  public InterfaceExampleImpl(int formaPagamentoId) {
    this.formaPagamentoEnum = FormaPagamentoEnum.fromValue(formaPagamentoId);
    if (formaPagamentoEnum == FormaPagamentoEnum.DEBITO) {

    }
  }

  public enum FormaPagamentoEnum {
    CREDITO(1),
    DEBITO(2);

    private final int value;

    FormaPagamentoEnum(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }

    public static FormaPagamentoEnum fromValue(int value) {
      for (FormaPagamentoEnum method : FormaPagamentoEnum.values()) {
        if (method.value == value) {
          return method;
        }
      }
      throw new IllegalArgumentException("Invalid value: " + value);
    }
  }


  @Override
  public void printMagico(String str) {
  }
}
