package edu.escuelaing.cnyt.app;

import static org.junit.Assert.*;
import org.junit.Test;


public class complexTest {
	
	@Test
	public void deberiaSumar() {
		Complex numero1 = new Complex(1,-4);
		Complex numero2 = new Complex(5,3);
		Complex suma = numero1.complexSum(numero2);
		double real = suma.getReal();
		double imaginario = suma.getImaginario();
		
		assertTrue(real == 6.0);
		assertTrue(imaginario == -1.0);
	}
	
	@Test
	public void deberiaRestar() {
		Complex numero1 = new Complex(1,-4);
		Complex numero2 = new Complex(5,3);
		Complex resta = numero1.resta(numero2);
		double real = resta.getReal();
		double imaginario = resta.getImaginario();
		
		assertTrue(real == -4.0);
		assertTrue(imaginario == -7.0);
	}
	
	@Test
	public void deberiaMultiplicar() {
		Complex numero1 = new Complex(1,-4);
		Complex numero2 = new Complex(5,3);
		Complex mul = numero1.multiplicacion(numero2);
		double real = mul.getReal();
		double imaginario = mul.getImaginario();
		
		assertTrue(real == 17.0);
		assertTrue(imaginario == -17.0);
	}
	
	@Test
	public void deberiaSacarConjugado() {
		Complex numero1 = new Complex(1,-4);
		Complex conjugado = numero1.conjugado();
		double real = conjugado.getReal();
		double imaginario = conjugado.getImaginario();
		
		assertTrue(real == 1.0);
		assertTrue(imaginario == 4.0);
	}
	
	@Test
	public void deberiaSacarDivision() {
		Complex numero1 = new Complex(1,-4);
		Complex numero2 = new Complex(5,3);
		Complex div = numero1.division(numero2);
		double real = div.getReal();
		double imaginario = div.getImaginario();
		
		assertTrue(real == -0.21);
		assertTrue(imaginario == -0.68);
	}
	
	@Test
	public void deberiaSacarModulo() {
		Complex numero1 = new Complex(1,-4);
		double modulo = numero1.modulo();
		assertTrue(modulo == 4.12);
	}
	
	@Test
	public void deberiaSacarAngulo() {
		Complex numero1 = new Complex(1,-4);
		double angulo = numero1.angulo();
		assertTrue(angulo == -75.96);
	}
	
	@Test
	public void deberiaSacarPolar() {
		Complex numero1 = new Complex(1,-4);
		double[] polar = numero1.polar();
		assertTrue(polar[0] == 4.12);
		assertTrue(polar[1] == -75.96);
	}
	
	@Test
	public void deberiaSacarFase() {
		Complex numero1 = new Complex(1,-4);
		double angulo = numero1.fase();
		assertTrue(angulo == -75.96);
	}
}