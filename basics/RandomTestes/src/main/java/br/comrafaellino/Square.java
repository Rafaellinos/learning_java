package br.comrafaellino;

public class Square implements Shape<Double> {

  private double side;

  public void setSide(double side) {
    this.side = side;
  }

  @Override
  public Double getArea() {
    return Math.pow(side, 2);
  }
}
