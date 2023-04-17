package ejer03;

public class Perecedero extends Productos {

		private int caducaEn=0;

		public Perecedero(String nombre, int precio, int caducaEn) {
			super(nombre, precio);
			this.caducaEn = caducaEn;
		}

		public int getCaducaEn() {
			return caducaEn;
		}

		public void setCaducaEn(int caducaEn) {
			this.caducaEn = caducaEn;
		}


}
