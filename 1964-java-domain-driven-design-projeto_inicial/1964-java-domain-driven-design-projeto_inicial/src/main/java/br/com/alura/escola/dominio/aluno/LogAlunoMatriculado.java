package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.Evento;
import br.com.alura.escola.dominio.Ouvinte;

import java.time.format.DateTimeFormatter;

public class LogAlunoMatriculado extends Ouvinte {

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }

    public void reageAo(Evento evento) {
        AlunoMatriculado alunoMatriculado = (AlunoMatriculado) evento;
        String momentoFormatado = alunoMatriculado.momento().format(DateTimeFormatter.ISO_DATE);
        System.out.println(
                String.format(
                        "Aluno com CPF %s matriculado em %s",
                        alunoMatriculado.getCpfDoAluno(), momentoFormatado
                )
        );
    }
}
