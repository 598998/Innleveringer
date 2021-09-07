package no.hvl.dat100;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Angi et tall 'n' større enn 0:"));
		long sum = 1;
		
		for (int i=1; i<=n; i++) {
		
	    sum *= i;
			
		}	
		
	    javax.swing.JOptionPane.showMessageDialog(null, "n! er: " + sum);
		
	}
	
}