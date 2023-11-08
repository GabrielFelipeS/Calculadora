package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestePrincipal {

	@Test
	void testandoExecucao() {
		Principal principal = new Principal();
		principal.main(null);
	}

}
