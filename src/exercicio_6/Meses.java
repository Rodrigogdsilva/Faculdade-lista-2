package exercicio_6;

import javax.swing.JOptionPane;

public class Meses {

	int mes;

	public void convMeses(int a) {
		mes = a;
		switch (mes) {

		case 1:

			JOptionPane.showMessageDialog(null, "O m�s correspondente � janeiro !");

			break;

		case 2:

			JOptionPane.showMessageDialog(null, "O m�s correspondente � fevereiro !");

			break;

		case 3:

			JOptionPane.showMessageDialog(null, "O m�s correspondente � mar�o !");

			break;

		default:

			JOptionPane.showMessageDialog(null, "Invalido, o m�s n�o corresponde meses do primeiro trimestre do ano.");
		}
	}

}
