import javax.swing.JOptionPane;

public class Aula05Exe07 {
	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog(" agora digite outro numero"));
		if ((numero1 < numero2) && (numero2 < numero3))
			JOptionPane.showMessageDialog(null, String.format("%d %d %d", numero1, numero2, numero3));
		if ((numero1 < numero3) && (numero3 < numero2))
			JOptionPane.showMessageDialog(null, String.format("%d %d %d", numero1, numero3, numero2));
		if ((numero2 < numero1) && (numero1 < numero3))
			JOptionPane.showMessageDialog(null, String.format("%d %d %d", numero2, numero1, numero3));
		if ((numero2 < numero3) && (numero3 < numero1))
			JOptionPane.showMessageDialog(null, String.format("%d %d %d", numero2, numero3, numero1));
		if ((numero3 < numero1) && (numero1 < numero2))
			JOptionPane.showMessageDialog(null, String.format("%d %d %d", numero3, numero1, numero2));
		if ((numero3 < numero2) && (numero2 < numero1))
			JOptionPane.showMessageDialog(null, String.format("%d %d %d", numero3, numero2, numero1));
	}
}