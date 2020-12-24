package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car holden = new Car();
	    porsche.setModel("Carrera");
	    porsche.setDoors(2);
	    porsche.setWheels(4);
        System.out.println(porsche.getModel());
    }
}
