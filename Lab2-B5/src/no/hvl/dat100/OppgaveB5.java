package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class OppgaveB5 {

	public static void main(String[] args) {
		
		for (int i = 1; i<=10; i++) {
		
		int poengsum = parseInt(showInputDialog("Poengsum: "));
		
	    if (poengsum <= 39 && poengsum >= 0) {
	        showMessageDialog(null, "Du har f�tt karakteren F");
		    }
		    else if (40 <= poengsum && poengsum <= 49) {
		    	
		    showMessageDialog (null, "Du har f�tt karakteren E");
		    }
		    else if (50 <= poengsum && poengsum <= 59) {
		    	
			showMessageDialog (null, "Du har f�tt karakteren D");
			}
		    else if (60 <= poengsum && poengsum <= 79) {
		    	
			showMessageDialog (null, "Du har f�tt karakteren C");
			}
		    else if (80 <= poengsum && poengsum <= 89){
		    showMessageDialog(null, "Du har f�tt karakteren B");
		    }
		    else if (90 <= poengsum && poengsum <= 100){
		    showMessageDialog(null, "Du har f�tt karakteren A");
		    }
		    else {
		    showMessageDialog(null, "Ugyldig karakter, pr�v p� nytt.");
		    i --;
		    }
	    
		}

	}

}
