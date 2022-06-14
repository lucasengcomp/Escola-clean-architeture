package br.com.alura.escola.dominio.aluno.seguranca;

public interface CifradorDeSenha {

    String cifrarSenha(String senha);
    boolean validarSenhaCifrada(String senhaCifrada, String senha);
}
