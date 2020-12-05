
public class Teste {
	public static void main(String[] args) {
		Conta c1 = new Conta(2005, "Rafael", 2350.30); // utilizando construtor, obrigaório
		
		System.out.println("Dados da conta:");
		System.out.println(c1.getNome());
		System.out.println(c1.getNumero());
		System.out.println(c1.getSaldo());
		
		c1.depositar(30);
		System.out.println(c1.getSaldo());
		c1.retirar(30);
		System.out.println(c1.getSaldo());
		c1.retirar(5000);
	}
}
