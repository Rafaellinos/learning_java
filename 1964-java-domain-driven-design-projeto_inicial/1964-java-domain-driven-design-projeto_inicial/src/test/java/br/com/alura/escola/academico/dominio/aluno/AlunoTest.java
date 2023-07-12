package br.com.alura.escola.academico.dominio.aluno;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.com.alura.escola.academico.dominio.exception.MaximoTelefoneException;

public class AlunoTest {

    CPF cpf;
    String nome;
    Email email;

    @BeforeEach
    void init() {
        this.cpf = new CPF("123.456.789-00");
        this.nome = "Rafael Veloso";
        this.email = new Email("rafael@email.com");
    }


    @Test
    @DisplayName("Número máximo de telefone por aluno")
    void criacaoTelefone_QuandoNumeroMaximoAtingido_throwMaximoTelefoneException() {
        // Arrange
        Aluno aluno = new Aluno(
                cpf, nome, email
        );
        aluno.adicionarTelefone(
                "11", "123456789"
        );
        aluno.adicionarTelefone(
                "11", "123456781"
        );

        // Act & Assert
        assertThrows(MaximoTelefoneException.class, () -> {
            aluno.adicionarTelefone(
                    "11", "123456782"
            );
        }, "Ao atingir o máximo de telefones adicionado deveria subir exception");
    }
}
