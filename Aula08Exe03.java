import javax.swing.JOptionPane;

public class Aula08Exe03 {

	public static void main(String[] args) {
		int qtdLinhasMatriz = Integer.parseInt(
				JOptionPane.showInputDialog("Digite a quantidade de linhas"));
		int qtdColunasMatriz = Integer.parseInt(
				JOptionPane.showInputDialog("Digite a quantidade de Colunas"));
		int [][] numerosDigitados = new int [qtdLinhasMatriz][qtdColunasMatriz];
		for(int i = 0; i < qtdLinhasMatriz; i++) {
			for(int n = 0; n < qtdColunasMatriz; n++) {
				numerosDigitados[i][n] = Integer.parseInt(
						JOptionPane.showInputDialog("Digite um numero"));
			}
		}
		for(int i = 0; i < qtdLinhasMatriz; i++) {
			for(int n = 0; n < qtdColunasMatriz; n++) {
				System.out.println(numerosDigitados[i][n] * 2);
			}
		}

		
	}

}
