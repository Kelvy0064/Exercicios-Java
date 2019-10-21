import javax.swing.JOptionPane;

public class Aula03Exe09 {

	public static void main(String[] args) {
		double raio = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o valor do raio: "));
	double area = 3.1415*raio*raio;
	JOptionPane.showMessageDialog(null,"O valor da area da circunferencia é: "+area);
		

	}

}
