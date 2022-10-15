package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menu{
	public static void main(String[]args) {
		try (Scanner sn = new Scanner(System.in)) {
			boolean salir = false;
			int opcion;
resolucion a = new resolucion();
ejercicio2 b = new ejercicio2();
ejercicio3 c = new ejercicio3();
ejercicio4 d = new ejercicio4();

 while (!salir) {
			 System.out.println("1. Opcion 1");
			 System.out.println("2. Opcion 2");
			 System.out.println("3. Opcion 3");
			 System.out.println("4. Opcion 4");
			 System.out.println("5. Salir");

			 try {

			     System.out.println("Escribe una de las opciones");
			     opcion = sn.nextInt();

switch(opcion) {
case 1:
			a.getEjercicio1();
			break;
case 2:
			b.getEjercicio2();
			break;
case 3:
			c.getEjercicio3();
			break;
case 4:
			d.getEjercicio4();
			break;
case 5:
			salir = true;
			break;
			default:
				System.out.println("Solo números entre 1 y 4");
			}
}catch (InputMismatchException e) {
			System.out.println("Debes insertar un número");
			sn.next();
}
 }
		}
	}
}