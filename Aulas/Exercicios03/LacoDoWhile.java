package Exercicios03;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		
		int numero,positv=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
		System.out.println("\nDigite um número: ");
		numero = leia.nextInt();
		
			if(numero >=0)
			positv += numero;
		}while(numero != 0);
		System.out.println("\nA soma dos números positivos é: "+positv);


	}

}
