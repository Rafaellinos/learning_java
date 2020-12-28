
public class OperadoresBitABit {
	public static void main(String[] args) {
		/*
		 * 720 => 000000000000000000010110100000
		 * 273 => 000000000000000000001000100000
		 * 720 & 273 => 000000000000000000000000100000 => 16
		 * Soma somente 1 + 1 = 1, o resto retorna 0
		 * 0 & 1 = 0
		 * 1 & 0 = 0
		 * 0 & 0 = 0
		 * 1 & 1 = 1
		 */
		// OR
		/*
		 * 720 => 000000000000000000010110100000
		 * 273 => 000000000000000000001000100000
		 * 720 | 273 => 000000000000000000000000100000 => 16
		 * Retorna 1 se um dos casos for 1:
		 * 0 | 1 = 1
		 * 1 | 0 = 1
		 * 1 | 1 = 1
		 * 0 | 0 = 0
		 * 
		 */
		// ^ (XOR)
		/*
		 * 720 => 000000000000000000010110100000
		 * 273 => 000000000000000000001000100000
		 * 720 ^ 273 => 000000000000000000000000100000 => 16
		 * Retorna 1 quando os operandos forem diferentes
		 * e 0 se forem iguais:
		 * 0 | 1 = 1
		 * 1 | 0 = 1
		 * 1 | 1 = 0
		 * 0 | 0 = 0
		 * 
		 */
		// NOT
		/*
		 * 720 => 000000000000000000010110100000
		 * ~720 => 111111111111111111101001011111
		 * Simplesmente inverte 
		 */
		// <<
		/*
		 * 12 => 000000000000000000000000001100
		 * 273 => 000000000000000000000000110000
		 * Simplesmente desloca os operadores para esquerda.
		 * A ideia que que seja multiplicado
		 * 
		 */
		// >>
		/*
		 * 12 => 0000000000000000000000000011000
		 * 273 => 000000000000000000000000000110
		 * Simplesmente desloca os operadores para direito
		 * A ideia que que seja dividido
		 * 
		 */
		
		// Precedencia
		
		double result = 4 + 6 / 2; //result 7
		System.out.println(result);
		
		int numero = 6;
		// é impar?
		System.out.println(numero % 2 != 0);
		
	}
}
