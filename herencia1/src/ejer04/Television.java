package ejer04;

public class Television extends Electrodomestico{
	 // Declaramos los atributos de la clase

    /**
     * guarda el tamaño de la pantalla
     */
    private double resolucion;

    /**
     * si tiene o no tdt
     */
    private boolean sintonizador;


    /**
     * Constructor
     */
    public Television() {
        super();
        this.resolucion = 20;
        this.sintonizador = false;
    }

    /**
     * Constructor con el precio y el peso
     */

    public Television(double precioBase, double peso, double resolucion, boolean tdt) {
        super(precioBase, peso);
        this.resolucion = resolucion;
        this.sintonizador = tdt;
    }

    /**
     * Constructor con todos los parámetros
     */
    public Television(double precio, String color, char consu, double peso, double pulgadas, boolean tdt) {
 	   super(precio, peso, consu,color);
        this.resolucion = pulgadas;
        this.sintonizador = tdt;
        
    
    }

  /**
   * getters y setters
   * 
   */
    
    public double getResolucion() {
        return resolucion;
    }
    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }
    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    /**
     * Método que devuelve el precio final de la television
     */
    public double precioFinal() {
        // Llamamos al preciofinal del metodo padre
        double precioFinal = super.precioFinal();

        if (resolucion > 40) {
            precioFinal = precioFinal + (precioFinal * 0.3);
        }
        
        if (sintonizador) {
            precioFinal += 50;
        }

        return precioFinal;
    }
    
    @Override
    public String toString() {
        String cadena = "Tele: " + super.toString();
        cadena += ", res: " + resolucion;

        if (sintonizador) {
            cadena += ", TDT: SIP";
        } else {
            cadena += ", TDT: NOPE";
        }
        return cadena;
    }

}
