package br.comrafaellino;

public class Rectangle implements Shape<Double> {

  private double width;
  private double height;

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public Double getArea() {
    return width * height;
  }
}
