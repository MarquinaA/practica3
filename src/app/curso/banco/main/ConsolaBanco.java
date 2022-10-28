package app.curso.banco.main;

import java.util.HashMap;
import java.util.Scanner;

import app.curso.banco.entidad.Clientes;
import app.curso.banco.entidad.Gestores;

public class ConsolaBanco {

	public static void main(String[] args) {

		HashMap<Integer, Clientes> listaClientes = new HashMap<>();
		HashMap<Integer, Gestores> listaGestores = new HashMap<>();
		Scanner keyboard = new Scanner(System.in);

		int menuSeleccionado = -1;

		do {
			System.out.println("1. Crear Gestor\n");
			System.out.println("2. Crear cliente ");
			System.out.println("0. Salir\n");

			System.out.print("Opción: ");
			menuSeleccionado = keyboard.nextInt();

			switch (menuSeleccionado) {

			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				System.out.println("Creando gestor");

				System.out.print("Id Del Gestor: ");

				int nuevoId = keyboard.nextInt();
				
				System.out.print("Nombre del Gestor: ");

				String nombre = keyboard.next();
				System.out.print("Telefono Del Gestor: ");

				String numero = keyboard.next();
				System.out.print("Id De la oficina del Gestor: ");

				int idOficina = keyboard.nextInt();
				

				Gestores g1 = new Gestores(nuevoId, nombre, numero, idOficina);

				listaGestores.put(g1.getId(), g1);
				System.out.println("Se a creado nuevo Gestor" + g1.getName());

			case 2:
				

		}} while (menuSeleccionado != 0);

	}
}
