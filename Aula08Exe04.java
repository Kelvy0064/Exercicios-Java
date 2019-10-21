import javax.swing.JOptionPane;

public class Aula08Exe04 {

	public static void main(String[] args) {
		int [][] numerosDigitadosA = new int [3][3];
		int [][] numerosDigitadosB = new int [3][3];
		for(int i = 0; i < 3; i++) {
			for(int n = 0; n < 3; n++) {
				numerosDigitadosA[i][n] = Integer.parseInt(
						JOptionPane.showInputDialog("Digite um numero para matriz A"));
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int n = 0; n < 3; n++) {
				numerosDigitadosB[i][n] = Integer.parseInt(
						JOptionPane.showInputDialog("Digite um numero para matriz B"));
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int n = 0; n < 3; n++) {
				System.out.println(numerosDigitadosA[i][n] + numerosDigitadosB[i][n]);
			}
		}

		
	}

}
