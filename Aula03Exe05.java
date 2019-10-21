import javax.swing.JOptionPane;

public class Aula03Exe05 {

	public static void main(String[] args) {
		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter 1sh number: "));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter  2nd number: "));
		int number3 = Integer.parseInt(JOptionPane.showInputDialog("Enter 3rd number: "));
		int number4 = Integer.parseInt(JOptionPane.showInputDialog("Enter 4th number: "));
		int number5 = Integer.parseInt(JOptionPane.showInputDialog("Enter 5th number: "));
		int result = (number1 + number2 + number3 + number4 + number5)/5;
		JOptionPane.showMessageDialog(null, result);
	}

}
