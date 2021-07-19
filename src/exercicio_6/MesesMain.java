package exercicio_6;

import javax.swing.JOptionPane;

public class MesesMain {

	public static void main(String[] args) {
		
		int meses;
		
		meses = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite o valor corresponde a um mês do primeiro trimestre do ano. "));

		Meses m = new Meses();

		m.convMeses(meses);
	}

}
