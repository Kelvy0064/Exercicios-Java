import javax.swing.JOptionPane;

public class Aula08Exe05 {

	public static void main(String[] args) {
		int[][] numerosDigitados = new int[2][2];
		for(int i = 0; i < 2; i++) {
			for(int n = 0; n < 2; n++) {
				numerosDigitados[i][n] = Integer.parseInt(
						JOptionPane.showInputDialog("Digite um numero"));
			}	
		}
		double calculo = ((numerosDigitados[0][0] * numerosDigitados[1][1]) - 
				(numerosDigitados[0][1] * numerosDigitados[1][0]));
		System.out.println(calculo);
	}

}
