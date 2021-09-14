package fit.core;

public class Airplane implements Motorized {
  @Override
  public void start() {
    System.out.println("The airplane is starting ...");
  }

  @Override
  public void stop() {
    System.out.println("The airplane is stopping ...");
  }

  @Override
  public void reverse() {
    throw new IllegalStateException("Propeller airplane can't reverse");
  }

  // non-sense...
  public void doMaintenance(String maintenanceType) {
    if (maintenanceType.equals("predictive")) {
      System.out.println("The airplane is doing predictive maintenance ???");
      return;
    }
    
    if (maintenanceType.equals("corrective")) {
      System.out.println("The airplane is doing corrective maintenance ???");
      return;
    }

    System.out.println("Oh, well ... this is embarrassing  ... we're under maintenance ?");
  }

  public void taxi() {
    System.out.println("The airplane is taxiing ???");
  }

  public void wash() {
    System.out.println("The airplane is washing ???");
  }
}
