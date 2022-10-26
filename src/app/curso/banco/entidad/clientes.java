package app.curso.banco.entidad;

public class clientes extends persona {
	
	private float totalDinero;
	private float agregarDinero;
    private float retirarDinero;
	public clientes(int id, String name, String phone, float totalDinero) {
		super(id, name,  phone);
		this.totalDinero =totalDinero;
	}
	public void mostrarInfo() {

		super.mostrarInfo();
    	System.out.println("Total Dinero:"+this.totalDinero+"€");
    	}
	public float agregarDinero(float agregarDinero ) {
    	this.totalDinero+= agregarDinero;
    	return this.totalDinero;
    	
    	
    }
    public float retirarDinero(float retirarDinero) {
    	if(this.totalDinero - retirarDinero >= 0) {
    	this.totalDinero-= retirarDinero;
    	}else { System.out.println("Dinero no es Suficiente" );
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
	
	
}


