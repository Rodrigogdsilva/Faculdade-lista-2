package exercicio_4;

import javax.swing.JOptionPane;

public class ConverteGraus {

	public float radiano;

	final float pi = 3.1416F;

	public void convGrau(float a) {

		radiano = (a * pi) / 180;

	}

	public void exibe() {

		JOptionPane.showMessageDialog(null, "O grau convertido em radiano é: " + radiano);
	}
}
