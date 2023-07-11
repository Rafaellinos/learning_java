package br.com.alura.escola.infra.selo;

import br.com.alura.escola.dominio.aluno.RepositorioDeSelo;
import br.com.alura.escola.dominio.selo.Selo;
import br.com.alura.escola.dominio.selo.SeloNaoEncontrado;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RepositorioDeSeloEmMemoria implements RepositorioDeSelo {

    private List<Selo> selos = new ArrayList<>();

    @Override
    public void salvarSelo(Selo selo) {
        selos.add(selo);
    }

    @Override
    public Selo buscaPorCpf(String cpf) {
        Optional<Selo> seloEncontrado = selos.stream()
                .filter(selo -> selo.getCpfDoAluno().getNumero().equals(cpf)).findFirst();
        return seloEncontrado.orElseThrow(() -> new SeloNaoEncontrado("Selo do cpf " + cpf + " não encontrado"));
    }

    @Override
    public Selo buscarPorNome(String nome) {
        Optional<Selo> seloEncontrado = selos.stream()
                .filter(selo -> selo.getNome().equals(nome)).findFirst();
        return seloEncontrado.orElseThrow(() -> new SeloNaoEncontrado("Selo do nome " + nome + " não encontrado"));
    }
}
