package br.com.alura.escola.gameficacao.dominio.selo;

import br.com.alura.escola.shared.dominio.CPF;

public class Selo {

    private final CPF cpfDoAluno;
    private final String nome;

    public Selo(CPF cpfDoAluno, String nome) {
        this.cpfDoAluno = cpfDoAluno;
        this.nome = nome;
        System.out.println("Selo de " + nome + " criado para o cpf " + cpfDoAluno.getNumero());
    }

    public CPF getCpfDoAluno() {
        return cpfDoAluno;
    }

    public String getNome() {
        return nome;
    }
}
