package exercicio_4;

import javax.swing.JOptionPane;

public class GrausMain {

	public static void main(String[] args) {
		float grau = 0;

		grau = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o grau a ser convertido em radiano"));

		ConverteGraus g = new ConverteGraus();

		g.convGrau(grau);

		g.exibe();

	}

}
