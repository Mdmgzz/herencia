package ejer04;

public class Lavadora extends Electrodomestico{
    /**
     * Declaramos los atributos de la clase
     */
	/**
	 * variable que recogera la carga
	 */
    private double carga;

    /**
     * Constructor por defecto
     */
    public Lavadora() {
        super();
        this.carga = 5;
    }

    /**
     * constructor precio y el peso
     */
    public Lavadora(double precioBase, double peso, double carga) {
        super(precioBase, peso);
        this.carga = carga;
    }



    /**
     * Constructor con todos los parámetros
     */
    public Lavadora(double precio, String color, char consu, double peso,double carga) {
    	   super(precio, peso, consu,color);
           this.carga = carga;
    }

    /**
     * Metodos getter y setter
     */
    public double getCarga() {
        return carga;
    }
    public void setCarga(double carga) {
        this.carga = carga;
    }

    

    /**
     * Método que devuelve el precio final de la lavadora
     */
    public double precioFinal() {
    	//llamamos al metodo padre
        double precioFinal = super.precioFinal();

       
        if (carga > 30) {
            precioFinal += 50;
        }
        return precioFinal;
    }
    
    @Override
    public String toString() {
    	
        String cadena = "Lavadora: " + super.toString();
        cadena += ", carga: " + carga + "kg";

        return cadena;
    }
}
