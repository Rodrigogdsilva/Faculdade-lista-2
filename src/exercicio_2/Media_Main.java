package exercicio_2;

import javax.swing.JOptionPane;

public class Media_Main {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, media;

		nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a primeira nota"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a segunda nota"));
		nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a terceira nota"));
		nota4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a quarta nota"));

		media m1 = new media();

		m1.setNotas(nota1, nota2, nota3, nota4);

		JOptionPane.showMessageDialog(null, "A media é = " + m1.GetMedia());
	}

}
