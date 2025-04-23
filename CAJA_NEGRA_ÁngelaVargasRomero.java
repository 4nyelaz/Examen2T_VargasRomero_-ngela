package examenSegundoTrimestre;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CAJA_NEGRA_ÁngelaVargasRomero {

	
	// Clase Departamento
	Departamento dep = new Departamento("Departamento1", 1000.1);

	//Prueba de Valores Límites y Equivalentes
	@Test
	void validoProcesarProductos() {
		assertEquals(dep.procesarPedido(2000.5),false);
	}
	
	@Test
	void invalidoProcesarProductos() {
		assertEquals(dep.procesarPedido(50),true);
	}
	
	// Clase Instituto
	
	Instituto inst = new Instituto(50);
	
	// Prueba de Valores Límites
	@Test
	void validoEntrarIfAgregarDepartamento() {
		inst.agregarDepartamento("Departamento1", 500); // si es positivo entra en el if
		assertEquals(1, true);
	}
	
	@Test
	void invalidoEntrarIfAgregarDepartamento() {
		inst.agregarDepartamento("Departamento1", 500); // si es positivo entra en el if
		assertEquals(51, false);
	}
	
	
	
	
	

	
}
