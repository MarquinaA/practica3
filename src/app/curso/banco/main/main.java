package app.curso.banco.main;
import app.curso.banco.entidad.clientes;
import app.curso.banco.entidad.gestores;

public class main {

	public static void main(String[] args) {
		clientes cliente1 = new clientes(1 ,"alejandro","+(34)666555444", 0.0f);
			
		gestores gestor1 =new gestores(32,"leonardy","(34)666 666 666 ", 2);
		gestor1.mostrarInfo();
	}

}
 