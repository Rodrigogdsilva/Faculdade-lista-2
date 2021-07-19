package exercicio_8;

import javax.swing.JOptionPane;

public class Primo {

	public static void main(String[] args) {

		// TODO code application logic here

		int i, count;

		String ler;

		try {

			ler = JOptionPane.showInputDialog("Digite um número");

			int n = Integer.parseInt(ler);

			count = 0;

			for (i = 2; i <= n / 2; i++) {

				if (n % i == 0) {

					count++; // Armazenna

					break;
				}

			}

			// Testa se o número pelo qual a divis]ao foi possível é o póprio número
			
			if (count == 0 && n != 1) {

				System.out.println("É um número primo");

			} else {

				System.out.println("Não é um número primo");

			}

		} catch (NumberFormatException ex) {

			JOptionPane.showMessageDialog(null, "Digite apenas numeros ");

		}

	}

}
