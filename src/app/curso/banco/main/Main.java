package app.curso.banco.main;

import java.util.HashMap;

import app.curso.banco.entidad.Clientes;
import app.curso.banco.entidad.Gestores;

public class Main {

	public static void main(String[] args) {
		Clientes cliente1 = new Clientes(1, "alejandro", "+(34)666555444", 0.0f);

		Gestores gestor1 = new Gestores(32, "leonardy", "(34)666 666 666 ", 2);

		gestor1.mostrarInfo();
		System.out.println("____________________________");
		cliente1.abrirCuenta("ES25", 100.0f);
		System.out.println("____________________________");
		cliente1.mostrarInfo();
		System.out.println("____________________________");

		Clientes cliente2 = new Clientes(5, "jose", "+(00)000 000 000)", 0.0f);
		cliente2.setId(3);

		HashMap<String, Float> cuentas = new HashMap<>();

		cliente2.setCuentas(cuentas);
		System.out.println("____________________________");
		cliente2.motrarCuentas();
		System.out.println("____________________________");

		cliente1.retirarDinero("ES25", 25.0f);
		System.out.println("____________________________");

		cliente1.mostrarInfo();
		System.out.println("____________________________");

		cliente1.agregarDinero("ES25", 1000.0F);
		System.out.println("____________________________");

		cliente1.mostrarInfo();
		System.out.println("____________________________");

		cliente1.cerrarCuenta("ES25");

	}

}
