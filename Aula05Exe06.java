import javax.swing.JOptionPane;

public class Aula05Exe06 {
	public static void main(String[] args) {
		double ano = Double.parseDouble(JOptionPane.showInputDialog("Digite um ano: "));
		if(ano % 4 == 0)
			JOptionPane.showMessageDialog(null, "Ano Bissexto");
		else
			JOptionPane.showMessageDialog(null, "Ano não Bissexto");
	}
}
