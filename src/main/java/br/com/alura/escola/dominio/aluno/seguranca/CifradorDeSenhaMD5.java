package br.com.alura.escola.dominio.aluno.seguranca;

public class CifradorDeSenhaMD5 implements CifradorDeSenha {

    @Override
    public String cifrarSenha(String senha) {
        return null;
    }

    @Override
    public boolean validarSenhaCifrada(String senhaCifrada, String senha) {
        return false;
    }
}
