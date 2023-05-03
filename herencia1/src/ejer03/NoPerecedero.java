package ejer03;

public class NoPerecedero extends Productos {
		private String tipo;
		//objeto para llamar a la clase perecedero
		public NoPerecedero(String nombre, double precio) {
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
		@Override
		public double calcular ( int cantidad) {
			double res=0;
			
			res=super.calcular(cantidad);
			
			return res;
			
		}

}
