package br.com.alura.escola.dominio.aluno.interfaces;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.Cpf;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular(Aluno aluno);

    Aluno buscarPorCpf(Cpf cpf);

    List<Aluno> listarTodosAlunosMatriculados();
}
