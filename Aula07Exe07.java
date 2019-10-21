import java.util.Arrays;

import javax.swing.JOptionPane;

public class Aula07Exe07 {

	public static void main(String[] args) {
		int[] numeroDigitado = new int[5];
		for (int i = 0; i < 5; i++) {
			numeroDigitado[i] = Integer.parseInt(
					JOptionPane.showInputDialog("Digite o "+(i+1)+" numero"));
		}
		Arrays.sort(numeroDigitado);
		for (int i = 0; i < 5; i++) {
			System.out.println(numeroDigitado[i]);
		}
	}

}
