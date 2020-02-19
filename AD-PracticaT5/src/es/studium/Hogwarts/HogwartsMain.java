package es.studium.Hogwarts;

import java.io.BufferedReader;
import java.util.Scanner;

public class HogwartsMain {
	
	public static void main(String[] args) {
		
		
		
		int opcion;
		Scanner lectura = new Scanner(System.in);
		do {

			System.out.println("\n\nMenú Hogwarts: \n 1. Mostrar humanos \n 2. Mostrar nacidos antes del 1979 \n 3. Mostrar varitas de acebo \n 4. Mostrar todos los estudiantes vivos \n 5. Salir \n");
			opcion = lectura.nextInt();
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
				opcion=0;
			}
			
			
		}while(opcion!=5);
		
		lectura.close();
	}

}
