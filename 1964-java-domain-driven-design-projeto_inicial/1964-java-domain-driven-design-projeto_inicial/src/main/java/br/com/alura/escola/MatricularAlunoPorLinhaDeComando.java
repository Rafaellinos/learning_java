package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.dominio.PublicadorEventos;
import br.com.alura.escola.dominio.aluno.LogAlunoMatriculado;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";

		PublicadorEventos publicadorEventos = new PublicadorEventos();
		publicadorEventos.adicionar(new LogAlunoMatriculado());

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
