package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        System.out.println(price);
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        price = hamburger.itemizeHamburger();
        System.out.println(price);

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        price = healthyBurger.itemizeHamburger();
        System.out.println(price);

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        price = deluxeBurger.itemizeHamburger();
        System.out.println(price);

    }
}
