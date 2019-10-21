

import javax.swing.JOptionPane;

public class Aula03Exe03 {

	public static void main(String[] args) {
		double side1 = Double.parseDouble(
				JOptionPane.showInputDialog("Enter the size of the first side"));
		double side2 = Double.parseDouble(
				JOptionPane.showInputDialog("Enter the size of the second side"));
		double result = side1 * side2;
		String area = String.valueOf(result);
     	JOptionPane.showMessageDialog(null, String.format("The total area is: %s", area));	
	}
}