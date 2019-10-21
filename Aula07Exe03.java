import javax.swing.JOptionPane;

public class Aula07Exe03 {

	public static void main(String[] args) {
		int[] valorRecebido = new int[12];
		for(int i = 0; i < 12; i++) {
			valorRecebido[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor "+(i+1), 10));
		}
		int tamanho = valorRecebido.length;
		while(tamanho > 0) {
			int i = 0;
			JOptionPane.showMessageDialog(null, valorRecebido[i]*2);
			i++;
			tamanho--;
		}
	}
}
