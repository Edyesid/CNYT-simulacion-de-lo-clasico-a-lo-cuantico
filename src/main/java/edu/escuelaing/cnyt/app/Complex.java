package edu.escuelaing.cnyt.app;

public class Complex {
	private double a1;
	private double b1;
	/**
	 * Constructor de la clase de numero complejo
	 * @param real es la parte real del numero complejo
	 * @param imaginario es la parte imaginario del numero complejo
	 */
	
	public Complex(double real, double imaginario) {
		this.a1 = real;
		this.b1 = imaginario;
	}
	
	/**
	 * convierte la parte real y imaginario a la notacion de numero complejo
	 * @return String del numero complejo
	 */
	public String numToString() {
		String realString = String.valueOf(a1);
		String imaString = String.valueOf(b1);
		String negImaString = String.valueOf(-b1);
		if (b1 < 0) {
			return realString + " - " + negImaString + "i";
		}
		return realString + " + " + imaString + "i";
	}
	
	/**
	 * hace la suma entre dos numero complejos
	 * @param b es el numero a sumar
	 * @return retorna el numero complejo de la resta
	 */
	public Complex complexSum(Complex b) {
		double a2 = b.a1; 
		double b2 = b.b1;
		double real = a1 + a2;
		double imaginario = b1 + b2;
		return new Complex(real, imaginario);
	}
	
	/**
	 * hace la resta entre dos numeros complejos
	 * @param b es el numero a restar
	 * @return retorna el numero complejo de la resta
	 */
	public Complex resta(Complex b) {
		double a2 = b.a1;
		double b2 = b.b1;
		double real = a1 - a2;
		double imaginario = b1 - b2;
		return new Complex(real, imaginario);
	}
	
	/**
	 * Hace la multiplicacion entre dos numeros complejos
	 * @param b es el numero a multiplicar
	 * @return retorna el numero complejo de la multiplicacion
	 */
	public Complex multiplicacion(Complex b) {
		
		double a2 = b.a1;
		double b2 = b.b1;
		double real = (a1 * a2) - (b1 * b2);
		double imaginario = a1 * b2 + a2 * b1;
		return new Complex(real, imaginario);
	}
	
	/**
	 * Hace el conjugado del numero complejo
	 * @return retorna el numero complejo conjugado
	 */
	public Complex conjugado() {
		return new Complex(a1,-b1);
	}
	
	/**
	 * Hace la division entre dos numero complejos
	 * @param divisor es el divisor de la operacion
	 * @return retorna el numero complejo de la division
	 */

	public Complex division(Complex divisor) {
		
		Complex conjugado = divisor.conjugado();
		Complex numerador = this.multiplicacion(conjugado);
		Complex denominador = divisor.multiplicacion(conjugado);
		
		return new Complex((double)Math.round((numerador.a1 / denominador.a1) * 100d) / 100d,
		(double)Math.round((numerador.b1/denominador.a1) * 100d) / 100d);

	}

	/**
	 * Hace el modulo del numero complejo
	 * @return retorna el modulo
	 */
	public double modulo() {
		double mod = (double)Math.round((Math.pow(Math.pow(a1,2) + Math.pow(b1,2),0.5)) * 100d) / 100d;
		return mod;
	}
	
	/**
	 * Hace el modulo del numero complejo al cuadrado
	 * @return retorna el modulo
	 */
	public double moduloCuadrado() {
		double mod2 = Math.pow(a1,2) + Math.pow(b1,2);
		return mod2;
	}
	
	/**
	 * Hace el angulo de las coordenas cartesianas
	 * @return retorna el angulo del numero complejo
	 */
	public double angulo() {
		double ang = (double)Math.round((Math.toDegrees(Math.atan((b1)/(a1)))) * 100d) / 100d;
		return ang;
	}
	
	/**
	 * Saca la coordenada polares de las coordenadas cartesianas 
	 * @return retorna la coordenada polar
	 */
	public double[] polar() {
		double modulo = this.modulo();
		double angulo = this.angulo();
		double[] listPolar = {modulo,angulo};
		return listPolar;
	}
	
	/**
	 * Hace la fase del numero complejo
	 * @return la fase del numero complejo
	 */
	public double fase() {
		return (double)Math.round((Math.toDegrees(Math.atan((b1)/(a1)))) * 100d) / 100d;
	}
	
	public Complex inverso() {
		a1 = -a1;
		b1 = -b1;
		return new Complex(a1,b1);
	}
	
	
	public double getReal() {
		return a1;
	}
	
	public double getImaginario() {
		return b1;
	}
}