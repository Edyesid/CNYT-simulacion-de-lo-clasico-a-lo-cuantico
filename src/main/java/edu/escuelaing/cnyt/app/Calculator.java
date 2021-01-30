package edu.escuelaing.cnyt.app;

public class Calculator {

	public Calculator () {
	
	}
	/**
	 * Programa de las canicas
	 */
	public void estadoSistema() {
		
		int clicks = 25;
		
		System.out.println("El estado del sistema en " + clicks + " clicks de tiempo es: ");
		
		
		Complex[][] matrizAux = new Complex[][] 
		{{new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(1,0)},
		 {new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(1,0),new Complex(0,0),new Complex(0,0)},
		 {new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(1,0),new Complex(0,0)},
		 {new Complex(0,0),new Complex(0,0),new Complex(1,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0)},
		 {new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(1,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0)},
		 {new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(1,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0)},
		 {new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(1,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(1,0),new Complex(0,0),new Complex(0,0),new Complex(0,0)},
		 {new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(1,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0)},
		 {new Complex(0,0),new Complex(1,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0)},
		 {new Complex(1,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0)},
		 {new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(1,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0)},
		 {new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(1,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0)},
		 {new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0),new Complex(0,0)}};
		
		ComplexArray matriz1 = new ComplexArray(matrizAux);
		
		
		Complex[][] vectorAux = new Complex[][] 
		 {{new Complex(10,0)},{new Complex(4,0)},{new Complex(1,0)},{new Complex(7,0)},{new Complex(2,0)},{new Complex(2,0)},{new Complex(11,0)},{new Complex(0,0)},{new Complex(3,0)},{new Complex(1,0)},{new Complex(0,0)},{new Complex(5,0)},{new Complex(2,0)}};
		
		 ComplexArray vector = new ComplexArray(vectorAux);
		
		for(int i = 0; i < clicks; i++) {
			vector = matriz1.arrayMultiplicacion(vector);
		}
		
		if (vector != null) { vector.printArray();}
		
		Complex[][] array = vector.getArray();
		double[] lista = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			lista[i] = array[i][0].getReal();
		}
		
		Grafica grafica = new Grafica(lista);
		grafica.setVisible();
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------
	public void rendijas() {
		
		System.out.println("rendijas: ");
		int rendijas = 2;
		int blancos = 5;
		
		//-------------vector probabilidades------------
		Complex num1 = new Complex(0.2132007169,0.2132007169);
		Complex num2 = new Complex(-0.2132007169,-0.2132007169);
		Complex num3 = new Complex(-0.2132007169,0.2132007169);
		Complex num4 = new Complex(-0.2132007169,-0.2132007169);
		Complex num5 = new Complex(0.2132007169,-0.2132007169);
		Complex num6 = new Complex(-0.2132007169,-0.2132007169);
		Complex num7 = new Complex(-0.2132007169,-0.2132007169);
		Complex num8 = new Complex(-0.2132007169,-0.2132007169);
		Complex num9 = new Complex(0.2132007169,-0.2132007169);
		Complex num10 = new Complex(0.2132007169,-0.2132007169);
		Complex num11 = new Complex(-0.2132007169,0.2132007169);
		
		Complex[][] vectorAux = new Complex[][] {{num1},{num2},{num3},{num4},{num5},{num6},{num7},{num8},{num9},{num10},{num11}};
		
		Complex[][] matriz = new Complex[(2 * blancos + 1) * rendijas][(2 * blancos + 1) * rendijas];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] == null) {
					matriz[i][j] = new Complex(0,0);
				}
			}
		}

		int cont = 1;
		int cont2 = 1;
		for (int x = 0; x < rendijas; x++) {
			for(int z = 0; z < vectorAux.length; z++) {
				matriz[rendijas + cont2 + z][cont] = vectorAux[z][0];
			}
			cont += 1;
			cont2 += blancos + 1;
		}
		
		double num = 1 / Math.pow(rendijas, 0.5);
		
		for (int k = 0; k < rendijas; k++) {
			matriz[1 + k][0] = new Complex(num,0);
		}
		
		ComplexArray matriz1 = new ComplexArray(matriz);
		
		Complex num1d = new Complex(1,0);
		Complex num2d = new Complex(0,0);
		Complex num3d = new Complex(0,0);
		Complex num4d = new Complex(0,0);
		Complex num5d = new Complex(0,0);
		Complex num6d = new Complex(0,0);
		Complex num7d = new Complex(0,0);
		Complex num8d = new Complex(0,0);
		Complex num9d = new Complex(0,0);
		Complex num10d = new Complex(0,0);
		Complex num11d = new Complex(0,0);
		Complex num12d = new Complex(0,0);
		Complex num13d = new Complex(0,0);
		Complex num14d = new Complex(0,0);
		Complex num15d = new Complex(0,0);
		Complex num16d = new Complex(0,0);
		Complex num17d = new Complex(0,0);
		Complex num18d = new Complex(0,0);
		Complex num19d = new Complex(0,0);
		Complex num20d = new Complex(0,0);
		Complex num21d = new Complex(0,0);
		Complex num22d = new Complex(0,0);
		
		Complex[][] vectorInicial = new Complex[][] {{num1d},{num2d},{num3d},{num4d},{num5d},{num6d},{num7d},{num8d},
			{num9d},{num10d},{num11d},{num12d},{num13d},{num14d},{num15d},{num16d},{num17d},{num18d},{num19d},{num20d},{num21d},{num22d}};
		ComplexArray vectorInicial1 = new ComplexArray(vectorInicial);
		
		//matriz1.printArray();
		
		for(int i = 0; i < 2; i++) {
			vectorInicial1 = matriz1.arrayMultiplicacion(vectorInicial1);
		}
		
		ComplexArray vector = new ComplexArray(vectorInicial1.getArray());
		
		if (vector != null) { vector.printArray();}
		
		Complex[][] array = vector.getArray();
		double[] lista = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			lista[i] = array[i][0].moduloCuadrado();
		}
		
		Grafica grafica = new Grafica(lista);
		grafica.setVisible();
		
	}
	
	public void ensamblarSistema() {
		
		int clicks = 5;
		
		System.out.println("el sistema es: ");
		
		//matriz Matriz de la dinámica para el sistema probabilístico A
		
		Complex num1 = new Complex(0,0);
		Complex num2 = new Complex(0.2,0);
		Complex num3 = new Complex(0.3,0);
		Complex num4 = new Complex(0.5,0);
		Complex num5 = new Complex(0.3,0);
		Complex num6 = new Complex(0.2,0);
		Complex num7 = new Complex(0.1,0);
		Complex num8 = new Complex(0.4,0);
		Complex num9 = new Complex(0.4,0);
		Complex num10 = new Complex(0.3,0);
		Complex num11 = new Complex(0.2,0);
		Complex num12 = new Complex(0.1,0);
		Complex num13 = new Complex(0.3,0);
		Complex num14 = new Complex(0.3,0);
		Complex num15 = new Complex(0.4,0);
		Complex num16 = new Complex(0,0);

		Complex[][] matriz1 = new Complex[][] {{num1,num2,num3,num4},{num5,num6,num7,num8},{num9,num10,num11,num12},{num13,num14,num15,num16}};
		ComplexArray ma = new ComplexArray(matriz1);
		
		//Matriz de la dinámica para el sistema probabilístico B
		
		Complex num1d = new Complex(0,0);
		Complex num2d = new Complex(0.16666666,0);
		Complex num3d = new Complex(0.83333333,0);
		Complex num4d = new Complex(0.33333333,0);
		Complex num5d = new Complex(0.5,0);
		Complex num6d = new Complex(0.16666666,0);
		Complex num7d = new Complex(0.66666666,0);
		Complex num8d = new Complex(0.33333333,0);
		Complex num9d = new Complex(0,0);
		
		Complex[][] matriz2 = new Complex[][] {{num1d,num2d,num3d},{num4d,num5d,num6d},{num7d,num8d,num9d}};
		ComplexArray mb = new ComplexArray(matriz2);;
		ComplexArray tensor1 = ma.productoTensorial2(mb);
		
		Complex num1e = new Complex(0.2,0);
		Complex num2e = new Complex(0.1,0);
		Complex num3e = new Complex(0.6,0);
		Complex num4e = new Complex(0.1,0);
		
		Complex[][] matriz3 = new Complex[][] {{num1e},{num2e},{num3e},{num4e}};
		ComplexArray va = new ComplexArray(matriz3);
		
		Complex num1f = new Complex(0.7,0);
		Complex num2f = new Complex(0.15,0);
		Complex num3f = new Complex(0.15,0);
		
		Complex[][] matriz4 = new Complex[][] {{num1f},{num2f},{num3f}};
		ComplexArray vb = new ComplexArray(matriz4);
		
		ComplexArray tensor2 = va.productoTensorial2(vb);
		
		ComplexArray vector = new ComplexArray(tensor2.getArray());
		
		for(int i = 0; i < clicks; i++) {
			vector = tensor1.arrayMultiplicacion(vector);
		}
		
		if (vector != null) { vector.printArray();}
		
		Complex[][] array = vector.getArray();
		
		double[] lista2 = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			lista2[i] = array[i][0].getReal();
		}
		
		Grafica grafica = new Grafica(lista2);
		grafica.setVisible();
		
	}
	
	public static void main(String[] args) {
		Calculator calculo2 = new Calculator();
		calculo2.estadoSistema();
		calculo2.rendijas();
		calculo2.ensamblarSistema();
	}
}