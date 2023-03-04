package junit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class CalculadorTest {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(10, soma);
	}
}
