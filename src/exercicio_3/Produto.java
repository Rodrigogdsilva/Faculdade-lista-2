package exercicio_3;

import javax.swing.JOptionPane;

public class Produto {

	static public float GetDobro(float n1, float n2) {

		float res = (n1 / n2);

		return res;

	}

	public static void main(String[] args) {

		float x, y;
		float res;

		try {
			// entrada de valores

			String entrada1 = JOptionPane.showInputDialog("Digite o valor 1");

			x = Integer.parseInt(entrada1);

			String entrada2 = JOptionPane.showInputDialog("Digite o valor 2");

			y = Integer.parseInt(entrada2);

			// Chama o medódo e atribui a res

			res = GetDobro(x, y);

			// Exibe o calculo do metódo GetDobro
			System.out.println("O produto da divisão de " + x + " e " + y + " é: " + res);

		} catch (NumberFormatException ex) {

			System.out.println("Digite apenas numeros ");

		}

	}

}
