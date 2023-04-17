package ejer03;

public class NoPerecedero extends Productos {
		private String tipo;
		public NoPerecedero(String nombre, int precio) {
			super(nombre, precio);
		}

		public NoPerecedero(String nombre, int precio,String tipo) {
			super(nombre,precio);
			this.tipo = tipo;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

}
