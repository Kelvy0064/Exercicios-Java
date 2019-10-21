import javax.swing.JOptionPane;
public class Aula03Exe07 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Type your name: ");
		JOptionPane.showMessageDialog(null, String.format("Olá bem vindo %s", name));
	}
}
