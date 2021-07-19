package exercicio_1;

import javax.swing.JOptionPane;

public class Dobro {

	static public float GetDobro(float y) {

		float notafinal = (y * 2);
		return notafinal;
	}

	public static void main(String[] args) {

		float x, res;
		String entrada;

		try {
			entrada = JOptionPane.showInputDialog("Digite um valor");
			x = Integer.parseInt(entrada);

			System.out.println("Dobro de " + x + " é: " + GetDobro(x));

		} catch (NumberFormatException ex) {

			System.out.println("Digite apenas numeros ");

		}

	}

}
