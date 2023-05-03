package ejer03;

public class Productos {

		//atributos de la clase
		private String nombre;
		private double precio;

		// constructor con parametros
		public Productos(String nombre, double precio) {
			this.nombre = nombre;
			this.precio = precio;
		}

		// getters y stters
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(int precio) {
			this.precio = precio;
		}
	/**
	 * calcula la cantidad por el precio del producto
	 * @param cantidad cantidad de productos
	 * @return devuelve como resultado el double de la multiplicacion 
	 */
		public double calcular ( int cantidad) {
			double res=0;

			res= cantidad*precio;
			return res;
		}
	
	
}
