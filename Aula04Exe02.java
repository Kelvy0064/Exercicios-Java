import javax.swing.JOptionPane;

public class Aula04Exe02 {

	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		if(idade >= 18)
			JOptionPane.showInternalMessageDialog(null, "Maior de idade");
		else
			JOptionPane.showInternalMessageDialog(null, "Menor de idade");
	}
}
