package org.example;

import java.util.List;

public interface CalculadoraEmprestimo {
  List<Juro> calcularJuros();
  List<Taxa> calcularTaxas();
  List<Tarifa> calcularTarifas();
}
