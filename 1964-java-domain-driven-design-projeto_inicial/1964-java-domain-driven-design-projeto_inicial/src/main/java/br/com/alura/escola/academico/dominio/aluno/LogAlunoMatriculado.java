package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.Ouvinte;
import br.com.alura.escola.shared.dominio.evento.TipoDeEvento;

import java.time.format.DateTimeFormatter;

public class LogAlunoMatriculado extends Ouvinte {

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo() == TipoDeEvento.ALUNO_MATRICULA;
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
