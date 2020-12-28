package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean isCar = true;
        String warCar = isCar ? "É um carro": "Não é um carro";
        System.out.println(warCar);

        double myVar1 = 20.00d;
        double myVar2 = 80.00d;
        double result = (myVar1 + myVar2) * 100.00d;
        boolean teste = (int) (result % 40.00d) == 0 ? true : false;

        int score = 50;
        if (score == 50) System.out.println("score é 50"); // se tiver apenas uma expressão, nao precisa de {}

    }
}
