

import javax.swing.JOptionPane;

public class Aula03Exe02 {

	public static void main(String[] args) {
		double number = Double.parseDouble(JOptionPane.showInputDialog("type a number: "));
		number *= 2;
		JOptionPane.showMessageDialog(null, number);
	}

}
