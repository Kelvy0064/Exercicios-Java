import javax.swing.JOptionPane;

public class Aula03Exe04 {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));
		int previous = number - 1;
		int successor = number + 1;
		JOptionPane.showMessageDialog(null, String.format(
				"Number entered: %d \nPrevious number: %d \nSuccessor number: %d",
				number, previous, successor));
	}

}
