import javax.swing.JOptionPane;

public class Aula04Exe05 {
		public static void main(String[] args) {
		int note = Integer.parseInt(JOptionPane.showInputDialog("Nota"));
		if (note > 2) {
			if(note > 4) {
				if(note > 6) {
					if(note > 8) {
						if(note > 8)
						JOptionPane.showMessageDialog(null, "A");
					}else
						JOptionPane.showMessageDialog(null, "B");
				}else
					JOptionPane.showMessageDialog(null, "C");
			}else
				JOptionPane.showMessageDialog(null, "D");
		}else
			JOptionPane.showMessageDialog(null, "E");
			
		}
	}
