import javax.swing.JOptionPane;
public class Aula06Exe07 {
	public static void main(String[] args) {
		int numDigitado = Integer.parseInt(
				JOptionPane.showInputDialog("Digite um numero: "));
		for (int i = 1; i <= numDigitado; i++) {
			System.out.println("(H=" + i + "+1)" + (i + 1));
		}
	}
}