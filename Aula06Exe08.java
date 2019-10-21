import javax.swing.JOptionPane;

public class Aula06Exe08 {
	public static void main(String[] args) {
		int numDigitado = Integer.parseInt(
				JOptionPane.showInputDialog("Digite onumero: "));
		int atual = 0;
		int anterior = 0;

		int i = 1;
		while (atual < numDigitado) {
			if (i == 1) {
				atual = 1;
				anterior = 0;
			} else {
				atual += anterior;
				anterior = atual - anterior;
			}
			i++;
			System.out.print(atual + " ");
		}

	}
}
