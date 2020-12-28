
public class TesteSwitch {
	public static void main(String[] args) {
		String pais = "Mexico";
		
		
		switch (pais) {
		case "Brasil":
		case "Portugal":
			System.out.println("Bom dia!");
			break;
		case "Espanha1":
		case "Argentina":
			System.out.println("Buenos dias!");
			break;
		case "Franca":
			System.out.println("Bon jour!");
		default:
			System.out.println("Good morning");
		}
	}
}
