import javax.swing.JOptionPane;

public class Aula03Exe10 {

	public static void main(String[] args) {
		double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio"));
		double area = (4 * 3.1415*(raio*raio*raio))/3;
		JOptionPane.showMessageDialog(null,"O volume da esfera é: "+area);
	}
}
