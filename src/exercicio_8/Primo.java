package exercicio_8;

import javax.swing.JOptionPane;

public class Primo {

	public static void main(String[] args) {

		// TODO code application logic here

		int i, count;

		String ler;

		try {

			ler = JOptionPane.showInputDialog("Digite um n�mero");

			int n = Integer.parseInt(ler);

			count = 0;

			for (i = 2; i <= n / 2; i++) {

				if (n % i == 0) {

					count++; // Armazenna

					break;
				}

			}

			// Testa se o n�mero pelo qual a divis]ao foi poss�vel � o p�prio n�mero
			
			if (count == 0 && n != 1) {

				System.out.println("� um n�mero primo");

			} else {

				System.out.println("N�o � um n�mero primo");

			}

		} catch (NumberFormatException ex) {

			JOptionPane.showMessageDialog(null, "Digite apenas numeros ");

		}

	}

}
