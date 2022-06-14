package br.com.alura.escola.dominio.aluno.exceptions;

import br.com.alura.escola.dominio.aluno.Cpf;

public class AlunoNaoEncontrado extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public AlunoNaoEncontrado(Cpf cpf) {
        super("Aluno não encontrado com o CPF " + cpf.getNumero());
    }
}
