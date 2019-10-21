import javax.swing.JOptionPane;

public class Aula05Exe09 {

	public static void main(String[] args) {
		int tipoImovel = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite 1 para Recidência\n"
				+ "Digite 2 para Comercio\n"
				+ "Digite 3 para industria"));
		double horasConsumida = Double.parseDouble(
				JOptionPane.showInputDialog("Informe as horas consumidas"));
		if(tipoImovel == 1) {
			double calculo = horasConsumida * 1.29;
			String total = String.valueOf(calculo);
			JOptionPane.showMessageDialog(null, String.format("Total a pagar: %s", total));
		}
		if(tipoImovel == 2) {
			double calculo = horasConsumida * 0.67;
			String total = String.valueOf(calculo);
			JOptionPane.showMessageDialog(null, String.format("Total a pagar: %s", total));
		}
		if(tipoImovel == 3) {
			double calculo = horasConsumida * 0.32;
			String total = String.valueOf(calculo);
			JOptionPane.showMessageDialog(null, String.format("Total a pagar: %s", total));
		}
	}

}
