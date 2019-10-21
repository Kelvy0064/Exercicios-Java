import javax.swing.JOptionPane;

public class Aula07Exe06 {

	public static void main(String[] args) {
		double[] qtdProduto = new double[5];
		double[] precoProduto = new double[5];
		for (int i = 0; i < 5; i++) {
			precoProduto[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
			qtdProduto[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade do produto"));
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(precoProduto[i] * qtdProduto[i]);
		}
		

	}

}
