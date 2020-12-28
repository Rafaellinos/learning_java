
public class ExemploMetodo {
	
	static void exibirNome (String nome, int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			System.out.print(i);
			System.out.println(" " + nome);
			
		}
	}
	
	public static void main(String[] args) {
		
		exibirNome("Rafael", 10);
	}
	
}
