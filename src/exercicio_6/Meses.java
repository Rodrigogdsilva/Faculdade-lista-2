package exercicio_6;

import javax.swing.JOptionPane;

public class Meses {

	int mes;

	public void convMeses(int a) {
		mes = a;
		switch (mes) {

		case 1:

			JOptionPane.showMessageDialog(null, "O mês correspondente é janeiro !");

			break;

		case 2:

			JOptionPane.showMessageDialog(null, "O mês correspondente é fevereiro !");

			break;

		case 3:

			JOptionPane.showMessageDialog(null, "O mês correspondente é março !");

			break;

		default:

			JOptionPane.showMessageDialog(null, "Invalido, o mês não corresponde meses do primeiro trimestre do ano.");
		}
	}

}
