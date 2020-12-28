
public class OperadoresIncrementoDecremento {
	public static void main(String[] args) {
//		int a = 12;
//		a++;
//		
//		System.out.println(a);
//		
//		++a;
//		System.out.println(a);
		
		int a, b;
		b = (a = 10); // atribui tbm a atribuição ao b
		System.out.println(b);
		System.out.println(a);
		
		b = a++; // primeira coisa b vale 10, depois a ++
		b = ++a; // primeiro realiza o incremento, depois a atribuição
	}
}
