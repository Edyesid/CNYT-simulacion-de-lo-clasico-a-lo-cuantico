package edu.escuelaing.cnyt.app;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
public class Grafica{
	private double[] lista;
	
	public Grafica(double[] lista) {
		this.lista = lista;
	}
	public void setVisible() {
		
		DefaultCategoryDataset categoria = new DefaultCategoryDataset();
		for (int i = 0; i < lista.length; i++) {
			categoria.setValue(lista[i], "Estado" + i, "");
		}
		
		JFreeChart f = ChartFactory.createBarChart("Probabilidad del sistema", "Estados", "Probabilidades", categoria, PlotOrientation.VERTICAL, true, false, false);
		ChartFrame frame = new ChartFrame("cnyt", f);
		frame.pack();
		frame.setVisible(true);
		
	}
}