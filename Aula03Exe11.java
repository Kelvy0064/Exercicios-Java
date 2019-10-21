import javax.swing.JOptionPane;
public class Aula03Exe11 {
	public static void main(String[] args) {
		double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X"));
		double y = 2*x+20;
		JOptionPane.showMessageDialog(null,"O valor de Y é: "+y);
	}
}