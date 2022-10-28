package app.curso.banco.entidad;

public class Persona {

	protected int id;
	protected String name;
	protected String phone;

	Persona() {
	}

	Persona(int id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public void mostrarInfo() {
		System.out.println("Id:" + this.id);
		System.out.println("Nombre:" + this.name);
		System.out.println("Numero de Telefono:" + this.phone);

	}

	public int getId() {
		return id;
	}

	public static int setId(int id) {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}
