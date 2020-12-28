
public class ExemploMetodoRetorno {
	static double hipotenusa(double cateto1, double cateto2) {
		double tmp1 = Math.pow(cateto1, 2);
		double tmp2 = Math.pow(cateto2, 2);
		double tmp3 = tmp1 + tmp2;
		double tmp4 = Math.sqrt(tmp3);
		return tmp4;
	}
	
	public static void main(String[] args) {
		double resultado = hipotenusa(6.8, 3.2);
		System.out.println("Valor da hipotenusa: " + resultado);
	}
	
	/*
	 * Java pode ter mais de um método com o mesmo nome (Sobrecarga)
	 * Java chama um definido pela quantidade de parametros e tipos
	 */
}
