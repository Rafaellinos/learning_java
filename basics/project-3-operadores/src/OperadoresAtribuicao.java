
public class OperadoresAtribuicao {
	public static void main(String[] args) {
		double salario = 1200;
		
		salario += 300;
		
		System.out.println(salario);
		
		salario -= 300;
		
		System.out.println(salario);
		
		salario *= 2;
		System.out.println(salario);
		
		salario %= 1000;
		System.out.println(salario); // automódulo
	}
}
