package es.studium.Hogwarts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HogwartsMain {

	public static void main(String[] args) {

		int opcion;
		BufferedReader lectura;
		do {
			try {
				lectura = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("\nMenú Hogwarts: \n 1. Mostrar humanos \n 2. Mostrar nacidos antes del 1979 \n 3. Mostrar varitas de acebo \n 4. Mostrar todos los estudiantes vivos \n 5. Salir \n");
				opcion = Integer.parseInt(lectura.readLine());
				System.out.println();
				switch (opcion) {
				case 1:
					HogwartsMetodos.mostrarHumanos();
					break;
				case 2:
					HogwartsMetodos.mostrarNacidosAntes1979();
					break;
				case 3:
					HogwartsMetodos.mostrarVaritasAcebo();
					break;
				case 4:
					HogwartsMetodos.mostrarEstudiantesVivos();
					break;
				case 5:
					break;
				default:
					System.out.println("Opción erronea, vuelva a intentarlo");
					opcion = 0;
				}

			}catch (Exception e) {
				System.out.println("Opción erronea, vuelva a intentarlo");
				opcion = 0;
			}
		} while (opcion != 5);

	}

}
