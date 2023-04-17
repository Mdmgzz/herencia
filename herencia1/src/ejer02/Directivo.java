package ejer02;

public class Directivo extends Empleado {
	/**
	 * Atributo privado nombre 
	 */
	String nombre="";
	
	/**
	 * constructor con parametros 
	 * @param nombre entra como parametro el nombre
	 */
	public Directivo(String nombre) {
		super(nombre);
		this.nombre = nombre;
		
	}
	/**
	 * constructor sin parametros
	 */
	public Directivo(){
		
	}
	/**
	 * getter que obtiene el contenido de la variable nombre
	 * @return no devueleve nada
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * setter que define la variable priavada de esta clase con el valor de nombre 
	 * @param nombre el nombre del empleado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Metodo para mostrar el resultado , ya que unes la cadena emlpeado con el nombre del mismo
	 */
	@Override
	public String toString() {
		
		String cadena=super.toString();
		
		cadena+=" -> Directivo ";
		
		return cadena;
		
	}
}
