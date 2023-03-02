package Proyecto;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		Scanner tecla = new Scanner(System.in);
		
		int num1;
		
		do {
			System.out.println("Escribe un numero POSITIVO: ");
			num1=tecla.nextInt();
		}while (num1<0);
		
		if(num1%2==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
		tecla.close();
		
		System.out.println("PUNTO 5");
	}

}
