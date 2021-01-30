package edu.escuelaing.cnyt.app;

import javax.swing.JOptionPane;

public class ComplexArray {
	private int row;
	private int column;
	private Complex[][] array;

	public ComplexArray(Complex[][] array) {
		this.array = array;
		this.row = array.length;
		this.column = array[0].length;
	}
	/**
	 * Hace la suma de dos matrices
	 * @param arrayB es y la matriz
	 * @return la matriz resultante de la suma
	 */
	public ComplexArray sumArray(ComplexArray arrayB) {
		
		Complex[][] arraySuma = new Complex[row][column];
		Complex[][] array2 = arrayB.array;
		
		if (row != arrayB.row) {
			JOptionPane.showMessageDialog(null, "El numero de filas no es igual");
			return null;
		} else if(column != arrayB.column) {
			JOptionPane.showMessageDialog(null, "El numero de columnas no es igual");
			return null;
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arraySuma[i][j] = array[i][j].complexSum(array2[i][j]);
			}
		}
		return new ComplexArray(arraySuma);
	}
	/**
	 * Muestra la matriz inversa
	 * @return la nueva matriz inversa
	 */
	
	public ComplexArray arrayInverse() {
		
		Complex[][] arrayInverse = new Complex[row][column];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arrayInverse[i][j] = array[i][j].inverso();
			}
		}
		return new ComplexArray(arrayInverse);
	}
	/**
	 * multiplica un escalar por una matriz compleja
	 * @param escalar es el numero escalar a multiplicar por la matriz
	 * @return la matriz resultante de la multiplicacion
	 */
	public ComplexArray vectorEscalar(Complex escalar) {
		
		Complex[][] arrayEscalar = new Complex[row][column];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arrayEscalar[i][j] = array[i][j].multiplicacion(escalar);
			}
		}
		return new ComplexArray(arrayEscalar);
	}
	
	/**
	 * Hace la transpuesta de la matriz
	 * @return la matriz transpuesta
	 */
	public ComplexArray transpuesta() {
		
		Complex[][] arrayTranspuesta = new Complex[column][row];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arrayTranspuesta[j][i] = array[i][j];
			}
		}
		
		return new ComplexArray(arrayTranspuesta);
	}
	/**
	 * Hace el conjugado del matriz
	 * @return la matriz conjugada
	 */
	public ComplexArray arrayConjugado () {
		
		Complex[][] arrayConjugada = new Complex[row][column];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arrayConjugada[i][j] = array[i][j].conjugado();
			}
		}
		
		return new ComplexArray(arrayConjugada);
	}
	/**
	 * Saca la adjunta de la matriz
	 * @return la matriz adjunta
	 */
	public ComplexArray arrayAdjunta() {
		ComplexArray adjunta = this.transpuesta();
		
		return adjunta.arrayConjugado();
	}
	
	/**
	 * Hace la multiplicacion entre dos matrices
	 * @param arrayB
	 * @return la matriz resultante de la multiplicacion
	 */
	public ComplexArray arrayMultiplicacion(ComplexArray arrayB) {
		
		if (column != arrayB.row) {
			JOptionPane.showMessageDialog(null, "No se puede realizar la multiplicacion de matrices");
			return null;
		}
		
		Complex num = new Complex(0,0);
		
		Complex[][] complexMul = new Complex[row][arrayB.column];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < arrayB.column; j++) {
				for (int x = 0; x < column; x++) {
					
					num = (array[i][x].multiplicacion(arrayB.array[x][j])).complexSum(num);
					complexMul[i][j] = num;
				}
				num = new Complex(0,0);
			}
		}
		
		return new ComplexArray(complexMul);
	}
	
	public ComplexArray accionMatrizSobreVector(ComplexVector vector) {
		
		ComplexArray arrayB = new ComplexArray(vector.getVector());
		
		return this.arrayMultiplicacion(arrayB);
		
	}
	
	public boolean esUnitaria() {
		
		boolean valor = false;
		
		ComplexArray daga = this.arrayAdjunta();
		
		ComplexArray mul = this.arrayMultiplicacion(daga);
		
		mul.printArray();
		
		for (int i = 0; i < mul.row; i++) {
			for (int j = 0; j < mul.column; j++) {
				if (i == j && mul.array[i][j].getReal() == 1.0) {
					valor = true;
				} else if (i == j && mul.array[i][j].getReal() != 1.0) {
					return false;
				} else if (i != j && mul.array[i][j].getReal() != 0.0 ) {
					return false;
				}
			}
		}
		return valor;
		
	}
	
	public boolean esHermitiana() {
		
		boolean valor = false;
		
		ComplexArray daga = this.arrayAdjunta();
		
		if (row != daga.row || column != daga.column) {
			return false;
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (array[i][j].getReal() == daga.array[i][j].getReal()
					&& array[i][j].getImaginario() == daga.array[i][j].getImaginario()) {
					valor = true;
				}
			}
		}
		return valor;
	}
	
	public ComplexArray[][] productoTensorial(ComplexArray arrayB) {
		
		//Complex[][] tensorial = new Complex[row * arrayB.row][column * arrayB.column];
		ComplexArray[][] tensorialAux= new ComplexArray[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				ComplexArray aux = arrayB.vectorEscalar(array[i][j]);
				tensorialAux[i][j] = aux;
			}
		}
				 
		return tensorialAux;
		
	}
	
	public ComplexArray productoTensorial2(ComplexArray arrayB) {
		
		Complex[][] tensorial = new Complex[row * arrayB.row][column * arrayB.column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				for (int x = 0; x < arrayB.getArray().length; x++) {
					for (int y = 0; y < arrayB.getArray()[0].length; y++) {
						tensorial[i * arrayB.getArray().length + x][j * arrayB.getArray()[0].length + y] =
						array[i][j].multiplicacion(arrayB.getArray()[x][y]);
					}
				}
			}
		}
				 
		return new ComplexArray(tensorial);
		
	}

	/**
	 * imprime la matriz
	 */
	public void printArray() {
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("[" + array[i][j].numToString() + "]" + "    ");
			}
			System.out.println();
		}
	}
	
	public Complex[][] getArray() {
		return array;
	}
	
	
	
	/**
	 * producto interno de vectores 
	 * norma de vector
	 * 11 y 12 para vectores
	 * 13 unitaria si a*a()daga = I
	 * 14 hermitiana si a = a(daga)
	 */
	
}
