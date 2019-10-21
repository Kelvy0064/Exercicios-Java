import javax.swing.JOptionPane;

public class Aula07Exe04 {

	public static void main(String[] args) {
		int[] numerosDigitados = new int[6];
		for(int i = 0; i < 6; i++) {
			numerosDigitados[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º numero:"));
		}
		for(int i = 0; i < 6; i++) {
			if(numerosDigitados[i] == 25) {
				System.out.println("Existe o numero 25");
			}
		}

	}
}