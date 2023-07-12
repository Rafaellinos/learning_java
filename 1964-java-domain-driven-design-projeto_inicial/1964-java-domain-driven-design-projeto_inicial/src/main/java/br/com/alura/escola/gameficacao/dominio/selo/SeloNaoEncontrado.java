package br.com.alura.escola.gameficacao.dominio.selo;

public class SeloNaoEncontrado extends RuntimeException {
    public SeloNaoEncontrado(String message) {
        super(message);
    }
}
