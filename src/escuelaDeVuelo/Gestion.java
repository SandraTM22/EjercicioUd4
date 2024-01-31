package escuelaDeVuelo;

import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
		
		//********************Creamos nuestros 3 pilotos************************//		 
		Piloto piloto1 = new Piloto(1, "Pete Maverick", 10000, "Capitán");
		Piloto piloto2 = new Piloto(2, "Natasha Phoenix", 3000, "Teniente");
		Piloto piloto3 = new Piloto(3, "Bradley Rooster", 3500, "Teniente");
		

		//**************Pedimos al usuario que nos introduzca 2 pilotos*************//			
		Scanner sc = new Scanner(System.in);

		// Quizás haya alguna manera para hacerlo con un bucle pero de momento no lo
		// tengo claro.
		// Primer Piloto
		System.out.println("Por favor introduce los datos del primer piloto. Nombre del piloto:");
		String nomPiloto1 = sc.nextLine();
		System.out.println("Horas de vuelo acumuladas: ");
		int horasVuelo1 = sc.nextInt();
		System.out.println("Rango del piloto: ");
		String rangoPiloto1 = sc.next();
		Piloto piloto4 = new Piloto(4, nomPiloto1, horasVuelo1, rangoPiloto1);
		// Segundo Piloto
		System.out.println("Por favor introduce los datos del segundo piloto. Nombre del piloto:");
		String nomPiloto2 = sc.next();
		System.out.println("Horas de vuelo acumuladas: ");
		int horasVuelo2 = sc.nextInt();
		// Debemos poner otro nextLine() para que consuma los datos que quedan en el
		// "buffer"
		sc.nextLine();
		System.out.println("Rango del piloto: ");
		String rangoPiloto2 = sc.next();
		Piloto piloto5 = new Piloto(5, nomPiloto2, horasVuelo2, rangoPiloto2);

		// **************************Mostrar los pilotos*****************************//
		piloto1.mostrarPiloto();
		piloto3.mostrarPiloto();
		piloto4.mostrarPiloto();
		piloto5.mostrarPiloto();
		

		// *******************************Crear Aviones****************************//
		// Entrenamiento
		Entrenamiento entrenamiento1 = new Entrenamiento(110, "T-38 Talon", 20, piloto1, true);
		// Combate
		Combate combate1 = new Combate(220, "F-18", 30, piloto2, true);
		Combate combate2 = new Combate(220, "Eurofighter", 8, piloto3, false);
		

		// ********************Pedir usuario 2 aviones de entrenamiento*****************//
		//PRIMER AVION
		// inicializo la variable porque si no me da error en el constructor
		Piloto opPilot1 = null;
		//Declaro variables de apoyo para convertir la respuesta del usuario a booleano (aun no lo hemos dado en el temario)
		int tieneDob1;
		boolean tieneDobb1;
		System.out.println("Procedamos a crear dos aviones de entrenamiento.");
		sc.nextLine();
		System.out.println("Por favor introduce el modelo del primer avion de entrenamiento: ");
		String nomAvion1 = sc.nextLine();
		System.out.println("Capacidad de ocupantes: ");
		int capAvion1 = sc.nextInt();
		System.out.println("¿que piloto quieres asignar al avión?:" + " \n 1 = " + piloto1.getNombre() + "\n 2 = "
				+ piloto2.getNombre() + "\n 3 = " + piloto3.getNombre() + "\n 4 = " + piloto4.getNombre() + "\n 5 = "
				+ piloto5.getNombre());
		int opcion1 = sc.nextInt();

		switch (opcion1) {
		case 1:
			opPilot1 = piloto1;
			break;
		case 2:
			opPilot1 = piloto2;
			break;
		case 3:
			opPilot1 = piloto3;
			break;
		case 4:
			opPilot1 = piloto4;
			break;
		case 5:
			opPilot1 = piloto5;
			break;
		}
		//Preguntamos si tiene doble mando, y convierto el INT a booleano
		System.out.println("¿tiene doble mando? \n 0: No tiene mando \n 1: Si tiene doble mando");
		tieneDob1 = sc.nextInt();
		if(tieneDob1==0) {
			tieneDobb1 = false;
		} else {
			tieneDobb1 = true;
		}
		Entrenamiento entrenamiento2 = new Entrenamiento(120, nomAvion1, capAvion1, opPilot1, tieneDobb1);

		// SEGUNDO AVION
		// inicializo la variable porque si no me da error en el constructor
		Piloto opPilot2 = null; 
		//Declaro variables de apoyo para convertir la respuesta del usuario a booleano (aun no lo hemos dado en el temario)
		int tieneDob2;
		boolean tieneDobb2;
		sc.nextLine();
		System.out.println("Por favor introduce el modelo del segundo avion de entrenamiento: ");
		String nomAvion2 = sc.nextLine();
		System.out.println("Capacidad de ocupantes: ");
		int capAvion2 = sc.nextInt();
		System.out.println("¿que piloto quieres asignar al avión?:" + " \n 1 = " + piloto1.getNombre() + "\n 2 = "
				+ piloto2.getNombre() + "\n 3 = " + piloto3.getNombre() + "\n 4 = " + piloto4.getNombre() + "\n 5 = "
				+ piloto5.getNombre());
		int opcion2 = sc.nextInt();

		switch (opcion2) {
		case 1:
			opPilot2 = piloto1;
			break;
		case 2:
			opPilot2 = piloto2;
			break;
		case 3:
			opPilot2 = piloto3;
			break;
		case 4:
			opPilot2 = piloto4;
			break;
		case 5:
			opPilot2 = piloto5;
			break;
		}
		//Preguntamos si tiene doble mando, y convierto el INT a booleano
		System.out.println("¿tiene doble mando? \n 0: No tiene mando \n 1: Si tiene doble mando");
		tieneDob2 = sc.nextInt();
		if(tieneDob2==0) {
			tieneDobb2 = false;
		} else {
			tieneDobb2 = true;
		}
		Entrenamiento entrenamiento3 = new Entrenamiento(130, nomAvion2, capAvion2, opPilot2, tieneDobb2);

		//****************************Mostramos aviones************************//
		combate1.mostrarAvion();
		combate2.mostrarAvion();
		entrenamiento1.mostrarAvion();
		entrenamiento2.mostrarAvion();
		entrenamiento3.mostrarAvion();
		
		
		//****Cerramos Scanner*****/
		sc.close();
	}
}
