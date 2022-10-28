package app.curso.banco.util;

import app.curso.banco.util.utiles;
import java.util.Random;

public class utiles {

	public static final String[] NOMBRES = { "Jose", "Pedro", "Mario", "Leo" };

	public static final String[] APELLIDOS = { "Escola", "Montilla", "Marquina", "Arangure" };

	public static String nombreAleatorio(String[] nombres, String[] apellidos) {

		Random random = new Random();

		int indexNombre = random.nextInt(nombres.length);
		String nombreAleatorio = nombres[indexNombre];

		int indexApellidos = random.nextInt(apellidos.length);
		String apellidosAleatorios = apellidos[indexApellidos];
		
		String nombreCompleto = nombreAleatorio + " "+ apellidosAleatorios;

	    System.out.println(nombreCompleto);
		return nombreCompleto;

	}
	
}
