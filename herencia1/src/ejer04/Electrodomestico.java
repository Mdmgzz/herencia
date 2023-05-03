package ejer04;

public class Electrodomestico {

	
	enum consumo{
		A,B,C,D,E,F
		};
	protected double carga=5;
	protected consumo consu= consumo.F;
	protected double precio=100;
	protected String color="blanco";
	
	public Electrodomestico(){
		
	}
	
	public Electrodomestico( double precio, double peso) {
		this.precio=precio;
		this.carga=peso;
	}
	
	public Electrodomestico( double precio, double peso,consumo consu, String color) {
		this.precio=precio;
		this.carga=peso;
		this.color=color;
		this.consu=consu;
	}
	
	
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
	
	
	
}
