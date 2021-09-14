package fit.core;

public class Glider extends Airplane {
  
  @Override
  public void start() {
    throw new IllegalStateException("Gliders doesn't have engine...");
  }

  @Override
  public void stop() {
    throw new IllegalStateException("Gliders doesn't have engine...");
  }

}
