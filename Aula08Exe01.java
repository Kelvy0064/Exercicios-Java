import javax.swing.JOptionPane;

public class Aula08Exe01 {

	public static void main(String[] args) {
		int [] [] numeroDigitado = new int [2] [2];
		numeroDigitado[0][0] = Integer.parseInt(JOptionPane.showInputDialog("Primeiro numero"));
		numeroDigitado[0][1] = Integer.parseInt(JOptionPane.showInputDialog("Segundo numero"));
		numeroDigitado[1][0] = Integer.parseInt(JOptionPane.showInputDialog("Terceiro numero"));
		numeroDigitado[1][1] = Integer.parseInt(JOptionPane.showInputDialog("Quarto numero"));
		System.out.println(numeroDigitado[0][0]);
		System.out.println(numeroDigitado[0][1]);
		System.out.println(numeroDigitado[1][0]);
		System.out.println(numeroDigitado[1][1]);
	}

}
