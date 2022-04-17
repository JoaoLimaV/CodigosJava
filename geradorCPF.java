package Aleatórios;
import java.util.Random;
import java.util.Scanner;


public class geradorCPF {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int [] cpfSeparado = new int [11];
		int [] cpfSeparado2 = new int [10];
	    int maxrand = 9, dez = 0, onze = 0, soma = 0;
	    int contfalhas = 0;
	    boolean vdd = false;
	    String cpf = "";
	    
	    do{
	    	soma = 0;
	    	for (int x = 0; x < (cpfSeparado.length); x++) {
		    	  cpfSeparado[x] = rand.nextInt(maxrand); 
			}
		    dez = (cpfSeparado[9]);
			onze = (cpfSeparado[10]);

			// GERANDO SEGUNDO ARRAY COM OS DÌGITOS
		    for (int x = 0; x < (cpfSeparado2.length - 1); x++) {
		    	  cpfSeparado2[x] =  cpfSeparado[x];
			}
		    
		    // MULTIPLICANDO EM DECRECENTE
			 for (int x = 0, y = 10; x < (cpfSeparado2.length - 1); x++, y--) {
				 cpfSeparado2[x] = cpfSeparado2[x] * y;
		     }
			
		    // SOMANDO OS DÌGITOS DO ARRAY
			 for (int x = 0; x < (cpfSeparado2.length - 1); x++) {
				 soma += cpfSeparado2[x];
			 }
			 
		    // VERIFICANDO O PRIMEIRO DIGITO
			if((soma * 10) % 11 == dez){
				soma = 0;
				 for (int x = 0; x < (cpfSeparado2.length); x++) {
					 cpfSeparado2[x] = (cpfSeparado[x]);
			     }
				 for (int x = 0, y = 11; x < (cpfSeparado2.length); x++, y--) {
					// System.out.print(y + " * " + cpfSeparado2[x] + "=");
					 cpfSeparado2[x] = cpfSeparado2[x] * y;
					// System.out.print(cpfSeparado2[x] + "\n"); 
			     }
				 for (int x = 0; x < (cpfSeparado2.length); x++) {
					 soma +=cpfSeparado2[x];
			     }
				//VERIFICANDO O SEGUNDO DIGITO
				if((soma * 10) % 11 == onze){
					 vdd = true;
				 }else{
					 contfalhas++;
				 }

			 }else{
					 contfalhas++;
			 }

	    }while(vdd == false);
	    System.out.print("QUANTIDADE DE TENTATIVAS ATÉ GERAR CORRETAMENTE: " + contfalhas++);
	    System.out.print("\nCPF: ");
	    for (int x = 0; x < (cpfSeparado.length); x++) {
			 System.out.print(cpfSeparado[x]);
	     }
	    
	    
	    
	    
	    
	    /*
	    for(int x = 0; x < cpfSeparado2.length; x++){
				System.out.print("CPF " + (x + 1) + "°: "+ cpfSeparado2[x] );
				System.out.println("");
	    }
	    */
	}

}
