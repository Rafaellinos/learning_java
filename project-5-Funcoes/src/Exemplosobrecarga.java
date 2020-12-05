
public class Exemplosobrecarga {
	
	static void exibirNome (String nome, int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			System.out.print(i);
			System.out.println(" " + nome);
			
		}
	}
	
	static void exibirNome (String nome) {
		exibirNome(nome, 10);
	}
	
	static void exibirNome () {
		exibirNome("manuel", 10);
		
	}
	
	public static void main(String[] args) {
		exibirNome("Impacta", 10);
		exibirNome("Rafael");
		exibirNome();
	}
	
	/*
	 * Java pode ter mais de um método com o mesmo nome (Sobrecarga)
	 * Java chama um definido pela quantidade de parametros e tipos
	 */
}
