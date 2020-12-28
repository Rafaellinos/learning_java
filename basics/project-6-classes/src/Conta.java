
public class Conta {
	private int numero;
	private String nome;
	private double saldo; //Encapsulamento, centraliza na classe as regras de utilizaçao
	
	public Conta (int num, String nm, double sal) { // método contrutor
		numero = num;
		nome = nm;
		saldo = sal;
	}

	public Conta () { // método contrutor padrao vazio
		numero = 0;
		nome = "";
		saldo = 0;
	}
	
	public void depositar (double v) {
		saldo += v;
	}
	
	public void retirar (double v) {
		if (v <= saldo) saldo -= v;
		else System.out.println("Saldo insuficiente!");
	}
	
	public int getNumero () {
		return numero;
	}
	
	public void setNumero (int numero) {
		this.numero = numero;
	}
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome; // this é usado para pegar o valor da classe atual e não ao objeto local. Só é necessário quando há atributos ambiguos
	}
	
	public double getSaldo () {
		return saldo;
	}
	
	/*
	 * A terminologia get/set 
	 * Diz que os membros de dados devem ser privados!
	 * Inibir que outras partes do código acessem e manipulem os dados de maneira indevida
	 */
	
}
