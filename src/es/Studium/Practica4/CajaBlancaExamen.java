package es.Studium.Practica4;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CajaBlancaExamen {

	@Test
	void testCamino1() {
		String resultadoEsperado = "Ya eres mayor de edad";
		String resultadoReal= Examen.mensaje (18);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testCamino2() {
		String resultadoEsperado = "Ya puedes jubilarte";
		String resultadoReal= Examen.mensaje (67);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testCamino3() {
		String resultadoEsperado = "No pasa nada";
		String resultadoReal= Examen.mensaje (2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testCamino01() {
		boolean resultadoEsperado = true;
		boolean resultadoReal= Examen.validar ("0123456789");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testCamino02() {
		boolean resultadoEsperado = false;
		boolean resultadoReal= Examen.validar("012345678") ;
		assertEquals(resultadoEsperado, resultadoReal);
	}
}