package ejer04;

public class Electrodomestico {

	//enum del consyumo
	enum consumo{
		A,B,C,D,E,F
		};
		
		// atributos de la clase con los valores predefinidos
	 double carga=5;
	 consumo consu= consumo.F;
	 double precio=100;
	 String color="blanco";
	
	 // constructor sin parametros
	public Electrodomestico(){
		
	}
	// constructo con los parametros de precio y peso
	public Electrodomestico( double precio, double peso) {
		this.precio=precio;
		this.carga=peso;
	}
	// constructor con parametros
	public Electrodomestico( double precio, double peso,char consu, String color) {
		this.precio=precio;
		this.carga=peso;
		this.comprobarColor();;
		this.comprobarConsumoEnergetico(consu);
	}

	// getters y setters
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if (color!=null && color.length() >0)
		this.color = color;
	}


	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	public consumo getConsu() {
		return consu;
	}

	public void setConsu(consumo consu) {
		this.consu = consu;
	}
	/**
	 * comprueba si el consumo esta dentro de los permitidos
	 */
	private void comprobarConsumoEnergetico(char letra) {
		if (letra!='A'||letra!='B'||letra!='C'||letra!='D'||letra!='E'||letra!='F') {
			this.consu=consumo.valueOf(String.valueOf(letra));
		}
	}
	
	/**
	 * comprueba si el color esta dentro de los permitidos
	 */
	private  void comprobarColor() {
		switch (color) {

		case "negro":
			color="negro";
		case "rojo":
			color = "rojo";
		case "gris":
			color="gris";
		case "azul":
			color="azul";
			default: 
				color = "blanco";
		}
	}
	
	// este metodo segun el consunmo y su peso aumenta el precio final
	public double precioFinal() {
		double fainal=this.precio;
		
		switch(consu) {
		case A:
			fainal+=100;
			break;
		case B:
			fainal+=80;
			break;
		case C:
			fainal+=60;
			break;
		case D:
			fainal+=50;
			break;
		case E:
			fainal+=30;
			break;
		case F:
			fainal+=10;
			break;
		}
		
	if (carga>=0 && carga<=19) {
		fainal+=10;
	}
	if (carga>=20 && carga<=49) {
		fainal+=50;
	}
	if (carga>=50 && carga<=79) {
		fainal+=80;
	}
	if (carga>=80) {
		fainal+=100;
	}
	this.precio=fainal;
	
		return fainal;
	}
	
	/**
	 * muestra el electrodomestico
	 */
	@Override
	public String toString() {
		return "Electrodomestico:"+"\n"+"Precio=" + this.precio + ", Color=" + color + ", Consumo="
				+ consu + ", Peso=" + carga;
	}
	
	
}
