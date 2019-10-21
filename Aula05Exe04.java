import javax.swing.JOptionPane;

public class Aula05Exe04 {
	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 5: "));
		switch (number) {
		case 1:
			JOptionPane.showMessageDialog(null, "Um");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Dois");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "três");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Quatro");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Cinco");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Numero invalido");
		}
	}
}
