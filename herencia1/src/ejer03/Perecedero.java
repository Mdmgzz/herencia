package ejer03;

public class Perecedero extends Productos {

		private int caducaEn=0;

		/**
		 * 
		 * @param nombre
		 * @param precio
		 * @param caducaEn
		 */

		public Perecedero(String nombre, int precio, int caducaEn) {
			super(nombre, precio);
			this.caducaEn = caducaEn;
		}
		/**
		 * 
		 * @return
		 */
		public int getCaducaEn() {
			return caducaEn;
		}
		/**
		 * 
		 * @param caducaEn
		 */
		public void setCaducaEn(int caducaEn) {
			this.caducaEn = caducaEn;
		}
		/**
		 * funcion para calcular el precio en funcion de los dias que le falten para caducar
		 */
		public double calcular (int cantidad) {
			double res=super.calcular(cantidad);
			double resAbs=0;
			
			switch (caducaEn) {
				case 1: {
					resAbs=res/4;
					break;
				}
				case 2: {
					resAbs=res/3;
					break;
				}
				case 3:{
					resAbs=res/2;
					break;
				}
			}
			return resAbs;
	}


}
