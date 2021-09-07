package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveB4 {

	public static void main(String[] args) {
		
		int brutt = parseInt(showInputDialog("Bruttoinntekt: "));
		
	    if (brutt <= 164100) {
        showMessageDialog(null, "Du er fritatt fra skatt!");
	    }
	    else if (164101 <= brutt && brutt <= 230950) {
	    	
	    double skatt = brutt*0.0093;
	    showMessageDialog (null, "Din trinnskatt er på kr "+skatt);
	    }
	    else if (230951 <= brutt && brutt <= 580650) {
	    	
		    double skatt = brutt*0.0241;
		    showMessageDialog (null, "Din trinnskatt er på kr "+skatt);
		    }
	    	else if (580651 <= brutt && brutt <= 934050) {
	    	
		    double skatt = brutt*0.1152;
		    showMessageDialog (null, "Din trinnskatt er på kr "+skatt);
		    }
	    	else {
	    	double skatt = brutt*0.1452;
	    	showMessageDialog(null, "Din trinnskatt er på kr "+skatt);
	    	}
	    
    }
}