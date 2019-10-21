import javax.swing.JOptionPane;

public class Aula07Exe01 {

	public static void main(String[] args) {
		String[] nomes = new String[5];
		nomes[0] = JOptionPane.showInputDialog("Digite o primeiro nome:");
		nomes[1] = JOptionPane.showInputDialog("Digite o segundo nome:");
		nomes[2] = JOptionPane.showInputDialog("Digite o Terceiro nome:");
		nomes[3] = JOptionPane.showInputDialog("Digite o Quarto nome:");
		nomes[4] = JOptionPane.showInputDialog("Digite o Quinto nome:");
	    int tamanho = nomes.length;
	    int i = 0;
		while(tamanho > 1) {
			JOptionPane.showMessageDialog(null, nomes[i]);
			i++;	
		}
	}
}
