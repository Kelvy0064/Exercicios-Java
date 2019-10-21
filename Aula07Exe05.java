import java.util.Arrays;

import javax.swing.JOptionPane;

public class Aula07Exe05 {

	public static void main(String[] args) {
		int[] numerosPar = new int[10];
		int[] numerosImpar = new int[10];
		for(int i = 0; i < 10; i++) {
			int numeroRecebido = Integer.parseInt(JOptionPane.showInputDialog("Digite "+(i+1)));
			if(numeroRecebido % 2 == 0) {
				numerosPar[i] = numeroRecebido;
			}else {
				numerosImpar[i] = numeroRecebido;
			}
			}
		   Arrays.sort(numerosPar);
		   Arrays.sort(numerosImpar);
		for(int i = 0; i < 10; i++) {
			JOptionPane.showMessageDialog(null, numerosPar[i]);
			JOptionPane.showMessageDialog(null, numerosImpar[i]);
		}
		
	}

}
