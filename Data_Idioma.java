package Aleat�rios;

import java.util.Date;
import java.util.Locale;

public class Data_Idioma {

	public static void main(String[] args) {
		
		Date relogio = new Date();
        System.out.println("A hora do sistema � \n" + relogio.toString());
        
        System.out.println("");
        
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema � " + loc);

	}

}
