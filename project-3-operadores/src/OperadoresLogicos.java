
public class OperadoresLogicos {
	public static void main(String[] args) {
		
		int idade = 21;
		char sexo = 'M';
		
		boolean result = (idade >= 18 && sexo == 'M'); // &&, & = mesma coisa
		/*
		 * && só checa o necessário:
		 * ex:
		 * funcao1() && funcao2()
		 * caso a funcao1 retorne false, para por ai e nao verifica a segunda
		 * 
		 * & sempre executa os dois lados
		 * mesma coisa para | ou ||
		 */
		System.out.println(result);
		// operador ternário:
		
		char podeDirigir = idade >= 18 ? 's': 'n';
		System.out.println(podeDirigir);
	}
}
