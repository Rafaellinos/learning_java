package br.com.alura.escola;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.gameficacao.aplicacao.GeraSeloAlunoNovato;
import br.com.alura.escola.gameficacao.infra.selo.RepositorioDeSelosEmMemoria;
import br.com.alura.escola.shared.dominio.evento.PublicadorEventos;
import br.com.alura.escola.academico.dominio.aluno.LogAlunoMatriculado;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";

		PublicadorEventos publicadorEventos = new PublicadorEventos();
		publicadorEventos.adicionar(new LogAlunoMatriculado());
		publicadorEventos.adicionar(new GeraSeloAlunoNovato(new RepositorioDeSelosEmMemoria()));

		MatricularAluno matricular = new MatricularAluno(
				new RepositorioDeAlunosEmMemoria(),
				publicadorEventos
				);

		matricular.executa(
				new MatricularAlunoDto(nome, 
						cpf, 
						email));
	}

}
