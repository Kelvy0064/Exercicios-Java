import javax.swing.JOptionPane;

public class Aula03Exe06 {

	public static void main(String[] args) {
		int amountDay = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of day: "));
		int result = amountDay * 24;
		JOptionPane.showMessageDialog(null, String.format("Total in hours: %d", result));

	}

}
