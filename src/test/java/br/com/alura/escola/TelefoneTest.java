package br.com.alura.escola;

import static org.junit.jupiter.api.Assertions.*;

import br.com.alura.escola.aluno.Telefone;
import org.junit.jupiter.api.Test;

class TelefoneTest {

	@Test
	void naoDeveriaCriarTelefoneComDDDsInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "123456789"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("", "123456789"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "123456789"));
	}
	
	@Test
	void deveriaPermitirCriarTelefoneComDDDENumeroValidos() {
		String ddd = "11";
		String numero = "123456789";
		Telefone telefone = new Telefone(ddd, numero);
		assertEquals(ddd, telefone.getDdd());
		assertEquals(numero, telefone.getNumero());
	}
}
