package app.curso.banco.entidad;

public class persona {

		protected int id;
		protected String name;
		protected String phone;
        
		persona(){}
		
		persona(int id, String name, String phone) {
			this.id = id;
			this.name = name;
			this.phone = phone;
		}
		public void mostrarInfo() {
	    	System.out.println("Id:"+this.id);
	        System.out.println("Nombre:"+this.name);
	    	System.out.println("Numero de Telefono:"+this.phone);
	    	
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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


