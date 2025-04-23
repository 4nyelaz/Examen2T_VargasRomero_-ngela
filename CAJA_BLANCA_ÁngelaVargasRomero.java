package examenSegundoTrimestre;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CAJA_BLANCA_ÁngelaVargasRomero {

	// Clase Departamento
	Departamento dep = new Departamento("Departamento1", 1000.1);
	
	// Pruebas de decisiones, caminos y sentencias
	@Test
	void validoSumaPruebaProcesarProductos() {
		boolean resultado = dep.procesarPedido(500); // Añadimos una cantidad inferior al presupuesto para que haga la suma y de true.
		assertEquals(true,resultado); // comparación
	}
	
	@Test
	void invalidoSumaPruebaProcesarProductos() {
		boolean resultado = dep.procesarPedido(1200); // Añadimos una cantidad superior al presupuesto para que devuelva false
		assertEquals(false,resultado); // comparación
	}
	
	// Clase Instituto
	
	Instituto inst = new Instituto(50);
	
	@Test
	void validoAgregarDepartamento() {
		int depCantidad = 0;
		inst.agregarDepartamento("Dep1", 17000.7);
        Departamento[] dep = new  Departamento[depCantidad];
        assertEquals("Dep1", dep[0].getNombre());
        assertEquals(17000.7, dep[0].getPresupuesto());
	}
	
	@Test
	void invalidoAgregarDepartamento() {
		int depCantidad = 0;
		inst.agregarDepartamento("Dep1", 17000.7);
        Departamento[] dep = new  Departamento[depCantidad];
        assertEquals("Dep2", dep[0].getNombre());
        assertEquals(17000.6, dep[0].getPresupuesto());
	}
	
	
	
}


