package br.com.alura.escola.gameficacao.aplicacao;

import br.com.alura.escola.gameficacao.dominio.selo.Selo;

public interface RepositorioDeSelos {

    void salvarSelo(Selo selo);

    Selo buscaPorCpf(String cpf);

    Selo buscarPorNome(String nome);

}
