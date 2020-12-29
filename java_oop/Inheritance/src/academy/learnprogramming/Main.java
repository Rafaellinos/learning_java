package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Animal", 1, 1, 5, 5);
	    Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
	    dog.eat(); // usando o methods herdados
	    dog.walk();
	    dog.run();

		/* Overloading vs Overriding
		 *	Overloading: Same name, different parameters. Reuse.
		 *		- Compile time polymorphism
		 * 		- must have different parameters, same same.
		 * 	Overriding: Defining a method in child that already exists in parent class.
		 *		- Extending the parent functionalities and add more
		 * 		- Runtime polymorphism, Dynamic method dispatch (JVM decide at runtime who call)
		 * 		- Recommended to put @Override
		 * 		- Can't override static and final methods
		 */
	}
}
