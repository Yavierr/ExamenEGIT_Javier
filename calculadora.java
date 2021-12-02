package model;

import java.util.Scanner;

public class calculadora {

	static int num;
	static int num2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un numero por pantalla: ");
		num = Integer.parseInt(sc.nextLine());

		System.out.print("Introduzca otro numero por pantalla: ");
		num2 = Integer.parseInt(sc.nextLine());

		System.out.println("¿Qué operación desea realizar?\n1. Suma.\n2. Resta.\n3. Multiplicación.\n4. División.");
		int opc = Integer.parseInt(sc.nextLine());

		// Creamos el menu en el que elegiremos nuestras posibles operaciones.
		switch (opc) {
		case 1:
			suma();
			break;
		case 2:
			resta();
			break;
		case 3:
			multiplica();
			break;
		case 4:
			divide();
			break;
		}
	}

	public static void suma() {
		// Creamos la funcion suma, en la que sumaremos el numero uno con el numero 2.
		int sol;
		sol = num + num2;
		System.out.println("Suma: " + num + " + " + num2 + " = " + sol);
	}

	public static void resta() {
		// Creamos la funcion resta, en la que restaremos el numero uno con el numero 2.
		int sol;
		sol = num - num2;
		System.out.println("Resta: " + num + " - " + num2 + " = " + sol);
	}

	public static void multiplica() {
		// Creamos la funcion multiplica, en la que multiplicaremos el numero uno con el
		// numero 2.
		int sol;
		sol = num * num2;
		System.out.println("Multiplicación: " + num + " x " + num2 + " = " + sol);
	}

	public static void divide() {
		// Creamos la funcion division, en la que restaremos el numero uno con el numero
		// 2.
		int sol;
		int sol2;
		sol = num / num2;
		System.out.println("Divide: " + num + " / " + num2 + " = " + sol);
	}

}
