package edu.escuelaing.cnyt.app;
import javax.swing.JOptionPane;

public class ComplexVector {
	private int row;
	private int column;
	private Complex[][] vector;
	
	public ComplexVector(Complex[][] vector) {
		
		if(vector[0].length > 1) {
			JOptionPane.showMessageDialog(null, "El numero de columnas es mayor que uno");
			return;
		}
		this.vector = vector;
		this.row = vector.length;
		this.column = 1;
	}

	/**
	 * Hace la suma de dos vectores
	 * @param arrayB es y la matriz y o vector
	 * @return la matriz resultante de la suma
	 */
	public ComplexVector sumVector(ComplexVector vectorB) {
		
		Complex[][] vectorSuma = new Complex[row][column];
		Complex[][] vector2 = vectorB.vector;
		
		if (row != vectorB.row) {
			JOptionPane.showMessageDialog(null, "El numero de filas no es igual");
			return null;
		} else if(column > 1 || vectorB.column > 1) {
			JOptionPane.showMessageDialog(null, "El numero de columnas es mayor que uno");
			return null;
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				vectorSuma[i][j] = vector[i][j].complexSum(vector2[i][j]);
			}
		}
		return new ComplexVector(vectorSuma);
		
	}
	/**
	 * Muestra la inversa del vector
	 * @return El vector inverso
	 */
	public ComplexVector VectorInverso() {
		
		Complex[][] vectorInverso = new Complex[row][column];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				vectorInverso[i][j] = vector[i][j].inverso();
			}
		}
		return new ComplexVector(vectorInverso);
	}
	/**
	 * multiplica un escalar por un vector
	 * @param escalar
	 * @return el vector resultante
	 */
	public ComplexVector vectorEscalar(Complex escalar) {
		
		Complex[][] vectorEscalar = new Complex[row][column];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				vectorEscalar[i][j] = vector[i][j].multiplicacion(escalar);
			}
		}
		return new ComplexVector(vectorEscalar);
	}
	
	public Complex produtoInternoDeVectores(ComplexVector vectorB) {
		
		if (row != vectorB.row || column != vectorB.column) {
			JOptionPane.showMessageDialog(null, "Los vectores deben tener el mismo tamaño");
			return null;
		}
		
		ComplexArray array1 = new ComplexArray(vector);
		ComplexArray array2 = new ComplexArray(vectorB.vector);
		
		ComplexArray dagaArray1 = array1.arrayAdjunta();
		
		ComplexArray pIdVectores = dagaArray1.arrayMultiplicacion(array2);
		
		
		
		return pIdVectores.getArray()[0][0];
	}
	
	public double normaVector() {
		
		double suma = 0.0;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				suma += Math.pow(this.vector[i][j].getReal(), 2) + 
						Math.pow(this.vector[i][j].getImaginario(), 2);
			}
		}
		return Math.sqrt(suma);
	}
	
	public double distanciaVectores(ComplexVector vectorB) {
		
		ComplexVector resta = this.sumVector(vectorB.VectorInverso());
		
		return resta.normaVector();
		
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	public Complex[][] getVector() {
		return vector;
	}
	public void printVector() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("[" + vector[i][j].numToString() + "]");
			}
		}
	}
}




