package examenSegundoTrimestre;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class INTEGRACION_ÁngelaVargasRomero {

	
	@Test
	void validoDepartamento() {
		Departamento dep = new Departamento("Departamento1", 1000.0); 
		
		dep.procesarPedido(500);
		
		assertEquals(500, true);
	}
	
	@Test
	void invalidoDepartamento() {
		Departamento dep = new Departamento("Departamento1", 1000.0); 
		
		dep.procesarPedido(1500);
		
		assertEquals(500, false);
	}
	
	
	
	
}
