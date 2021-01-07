package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    Player player = new Player();
	    player.name = "TIM";
	    player.health = 20;
	    player.weapon = "Sword";

	    int damage = 10;
	    player.loseHealth(damage);
        System.out.println(player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
		System.out.println(player.healthRemaining());

		/*
		Problemas em não usar encapsulamento:
			1. Posso alterar o health, tirando o controle da classe
			player. O player não deveria conseguir alterar o health.

			2. Não expor os atributos internos também evitar que um cliente
			utilize indevidamente, ou não gera dependências.
			Por exemplo: Se um cliente passa a usar um atributo que deveria
			ser privado, o servidor passa a ser obrigado a manter aquele atributo
			intacto para não "quebrar" os clientes.

		 */
		System.out.println("______________________________________________");


		EnhancedPlayer player1 = new EnhancedPlayer("Tim", 50, "Sword");
		System.out.println("Initial health is " + player1.getHeath());

    }
}
