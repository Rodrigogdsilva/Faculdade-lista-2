package exercicio_7;

import javax.swing.JOptionPane;

public class Fatorial {

	static public float GetDobro(float n1) {

		float x;

		float res;

		res = 0;

		x = n1;

		while (n1 > 1) {

			res = x * (n1 - 1);

			x = res;

			n1 = --n1;

		}

		return res;

	}

	public static void main(String[] args) {

		float x, y;

		float res;

		try {

			// entrada de valores

			String entrada1 = JOptionPane.showInputDialog("Digite o valor 1");

			x = Integer.parseInt(entrada1);

			// Chama o medódo e atribui a res

			res = GetDobro(x);

			// Exibe o calculo do metódo GetDobro

			System.out.println("O fatorial de " + x + " é: " + res);

		} catch (NumberFormatException ex) {

			System.out.println("Digite apenas numeros ");

		}

	}

}
