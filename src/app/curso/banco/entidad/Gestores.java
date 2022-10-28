package app.curso.banco.entidad;

public class Gestores extends Persona {
	private int idOficina;

	public Gestores(int id, String name, String phone, int idOficina) {
		super(id, name, phone);
		this.idOficina = idOficina;
	}
	

	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("ID De La Oficina:" + this.idOficina);
	}

	public int getIdOficina() {
		return idOficina;
	}

	public void setIdOficina(int idOficina) {

		this.idOficina = idOficina;
	}


	

}
