package app.curso.banco.entidad;

import java.util.HashMap;

public class Clientes extends Persona {

	private float totalDinero;
	private float agregarDinero;
	private float retirarDinero;
	private HashMap<String, Float> cuentas;
	
	public Clientes() {

	}

	public Clientes(int id, String name, String phone, float totalDinero) {
		super(id, name, phone);
		this.totalDinero = totalDinero;
		this.cuentas = new HashMap<>();
	}

	public void abrirCuenta(String idCuenta, Float dinero) {
		this.cuentas.put(idCuenta, dinero);
		System.out.println("Esta abierto la cuenta: " + idCuenta);
		agregarDinero(dinero);
	}

	public void cerrarCuenta(String idCuenta) {
		Float dineroEnCuenta = this.cuentas.get(idCuenta);
		retirarDinero(idCuenta, dineroEnCuenta);
		this.cuentas.remove(idCuenta);
		System.out.println("Esta cuenta la cuenta : " + idCuenta);

	}

	public float agregarDinero(float dinero) {
		this.totalDinero += dinero;
		return this.totalDinero;

	}

	public float agregarDinero(String idCuenta, Float dinero) {
		Float dineroEnCuenta = this.cuentas.get(idCuenta);

		if (this.cuentas.get(idCuenta) != null) {
			this.cuentas.put(idCuenta, dineroEnCuenta + dinero);
			agregarDinero(dinero);

		} else {
			System.out.println("La cuenta no existe");
		}
		return this.totalDinero;

	}

	public void mostrarInfo() {
		System.out.println("Cuentas : ");

		super.mostrarInfo();
		System.out.println("Total Dinero:" + this.totalDinero + "€");
	}

	public void motrarCuentas() {
		this.cuentas.forEach((idCuenta, dinero) -> {
			System.out.println("> " + idCuenta + ": " + dinero + "€");
		});
	}

	public float retirarDinero(float dinero) {
		if (this.totalDinero - dinero >= 0) {
			this.totalDinero -= dinero;
		} else {
			System.out.println("Dinero no es Suficiente");
		}
		return this.totalDinero;
	}

	public float retirarDinero(String idCuenta, Float dinero) {
		Float dineroEnCuenta = this.cuentas.get(idCuenta);

		if (dineroEnCuenta != null) {
			this.cuentas.put(idCuenta, dineroEnCuenta - dinero);
			retirarDinero(dinero);
			System.out.println("Se ha retirado :" + dinero + " de la Cuenta" + idCuenta);

		} else {
			System.out.println("La cuenta no existe");
		}
		return this.totalDinero;

	}

	public float getTotalDinero() {
		return this.totalDinero;
	}

	public void setTotalDinero(float totalDinero) {
		this.totalDinero = totalDinero;
	}

	public float getAgregarDinero() {
		return this.agregarDinero;
	}

	public void setAgregarDinero(float agregarDinero) {
		this.agregarDinero = agregarDinero;
	}

	public float getRetirarDinero() {
		return retirarDinero;
	}

	public void setRetirarDinero(float retirarDinero) {
		this.retirarDinero = retirarDinero;
	}

	public HashMap<String, Float> getCuentas() {
		return cuentas;
	}

	public void setCuentas(HashMap<String, Float> cuentas) {
		this.cuentas = cuentas;
	}

}
