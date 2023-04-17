package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int num1;
		int num2;
		int resul;
		
		//Implementacion suma
		
		String aux;
		
		System.out.println("Indique el primer número");
		aux=sc.nextLine();
		num1=Integer.parseInt(aux);
		
		System.out.println("Indique el segundo número");
		aux=sc.nextLine();
		num2=Integer.parseInt(aux);
		
		resul = num1+num2;
		
		System.out.println("La suma es " +resul);
		
		//Implementacion resta
		
		resul = num1-num2;
		
		System.out.println("La resta es " +resul);
	}

}
