package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int num1;
		int num2;
		int resul;
		int respuesta=0;		
		
		String aux;		
	
		
		do {
			System.out.println("-1 sumar");
			System.out.println("-2 restar");
			System.out.println("-3 multiplicar");
			System.out.println("-4 dividir");
			System.out.println("-n salir");
			aux = sc.nextLine();
			respuesta = Integer.parseInt(aux);
			switch(respuesta) {
				case 1:
					System.out.println("Indique el primer número");
					aux=sc.nextLine();
					num1=Integer.parseInt(aux);
					
					System.out.println("Indique el segundo número");
					aux=sc.nextLine();
					num2=Integer.parseInt(aux);
					
					resul = num1+num2;
					System.out.println("La suma es " +resul);
					break;
				case 2:
					System.out.println("Indique el primer número");
					aux=sc.nextLine();
					num1=Integer.parseInt(aux);
					
					System.out.println("Indique el segundo número");
					aux=sc.nextLine();
					num2=Integer.parseInt(aux);
					
					resul = num1-num2;
					System.out.println("La resta es " +resul);
					break;
				case 3:
					System.out.println("Indique el primer número");
					aux=sc.nextLine();
					num1=Integer.parseInt(aux);
					
					System.out.println("Indique el segundo número");
					aux=sc.nextLine();
					num2=Integer.parseInt(aux);
					
					resul = num1*num2;
					
					System.out.println("La multiplicación es " +resul);
					
					break;
				case 4:
					System.out.println("Indique el primer número");
					aux=sc.nextLine();
					num1=Integer.parseInt(aux);
					
					System.out.println("Indique el segundo número");
					aux=sc.nextLine();
					num2=Integer.parseInt(aux);
					
					resul = num1/num2;
					
					System.out.println("La división es " +resul);
					resul = num1%num2;
					
					System.out.println("El resto es de la divisón es " +resul);
					break;
			}
		}while(respuesta!=0);
	}

}
