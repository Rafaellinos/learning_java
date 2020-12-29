package academy.learnprogramming;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); // super chama o construtor pai
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    private void chew() {
        System.out.println(this.getName() + " Chewing...");
    }

    public void walk() {
        System.out.println(this.getName() + " Walking...");
        move(5);
    }

    public void run() {
        System.out.println(this.getName() + " Running...");
        move(10);
        // evitar super, pq se vc sobreescrever ele nessa classe, o super
        // continuará a chamar o move do Animal.
    }
}
