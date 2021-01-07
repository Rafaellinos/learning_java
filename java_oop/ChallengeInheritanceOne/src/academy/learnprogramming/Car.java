package academy.learnprogramming;

public class Car extends Vehicle{

    private int wheels;
    private int dooers;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int dooers, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.dooers = dooers;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(); changed to " + this.currentGear + " gear.");
    }
    
    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity : Velocity: " + speed + " at direction: " + direction);
    }
}
