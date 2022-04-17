package Aleat�rios;
import java.util.Scanner;
import java.util.Arrays;

public class verificadorCPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cpf = " ";
		int dez = 0, onze = 0, soma = 0;
		
		String [] cpfSeparado = new String [11];
		int [] cpfSeparado2 = new int [10];

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o CPF (SEM PONTOS, BARRA ou TRA�OS): ");
		cpf = sc.nextLine();
		int tamanhoCPF = cpf.length();
		if(cpf.equals("11111111111") || cpf.equals("22222222222") || cpf.equals("33333333333") ||
		   cpf.equals("44444444444") || cpf.equals("55555555555") || cpf.equals("66666666666") ||
		   cpf.equals("77777777777") || cpf.equals("88888888888") || cpf.equals("99999999999") || tamanhoCPF > 11){
			
			System.out.print("CPF FALSO\n");
			
		}else {
			// Separando os D�gitos do CPF 
			
			for(int x = 0, j = 1; x < 11; x++,j++){
				if(j == 12){
					cpfSeparado[x] = cpf.substring((x-2),(x-1));
				}else{
					cpfSeparado[x] = cpf.substring(x,j);
				}
	
			}
			// Atribui��o dos N�meros Verificadores
			dez = Integer.parseInt(cpfSeparado[9]);
			onze = Integer.parseInt(cpfSeparado[10]);
			
			
			// PRIMEIRO D�GITO VERIFICADOR 
			// Convert - String to INT
			 for (int x = 0; x < (cpfSeparado2.length - 1); x++) {
				 cpfSeparado2[x] = Integer.parseInt(cpfSeparado[x]);
		     }
			 
			 for (int x = 0, y = 10; x < (cpfSeparado2.length - 1); x++, y--) {
				 cpfSeparado2[x] = cpfSeparado2[x] * y;
		     }
			 
			 for (int x = 0, y = 10; x < (cpfSeparado2.length - 1); x++, y--) {
				 soma +=cpfSeparado2[x];
		     }
			 
			 if( (soma * 10) % 11 == dez){
			// soma = 0;
				 for (int x = 0; x < (cpfSeparado2.length); x++) {
					 cpfSeparado2[x] = Integer.parseInt(cpfSeparado[x]);
			     }
				 for (int x = 0, y = 11; x < (cpfSeparado2.length); x++, y--) {
					 cpfSeparado2[x] = cpfSeparado2[x] * y;
			     }
				 for (int x = 0; x < (cpfSeparado2.length); x++) {
					 soma +=cpfSeparado2[x];
			     }
				 
				 if( (soma * 10) % 11 == onze){
					 System.out.print("CPF VERDADEIRO\n");
					 
				 }else{
					 System.out.print("CPF FALSO\n");
				 }
				 
			 }else{
				 System.out.print("CPF FALSO");
			 }
		}
		 
		/* 
		  for(int x = 0; x < cpfSeparado2.length; x++){
				System.out.print("CPF " + (x + 1) + "�: "+ cpfSeparado2[x] );
				System.out.println("");
			}
		*/

	}

}
