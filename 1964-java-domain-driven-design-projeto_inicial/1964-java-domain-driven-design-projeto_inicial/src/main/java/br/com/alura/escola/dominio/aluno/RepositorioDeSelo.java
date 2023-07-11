package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.selo.Selo;

public interface RepositorioDeSelo {

    void salvarSelo(Selo selo);

    Selo buscaPorCpf(String cpf);

    Selo buscarPorNome(String nome);

}
