import javax.swing.JOptionPane;

public class Aula07Exe02 {

	public static void main(String[] args) {
		double[] preco = new double[12];
		for(int i = 0; i < 12; i++) {
			preco[i] = Integer.parseInt(JOptionPane.showInputDialog("Preço "+ (i+1)));
		}
		int tamanho = preco.length;
		while(tamanho > 0) {
			tamanho--;
			System.out.println(preco[tamanho]);
		}
	}

}