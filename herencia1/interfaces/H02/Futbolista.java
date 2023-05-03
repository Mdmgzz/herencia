package H02;

public class Futbolista implements Comparable<Futbolista> {
	
    private int numCamiseta;	// se guarda el numero de la camiseta
    private String nombre;		// se guarda el nombre del jugador
    private int edad;			// la edad del jugador
    private int numGoles;		// el numero de goles del jugador
    /**
     * contrustor con parametros
     * @param numCamiseta
     * @param nombre
     * @param edad
     * @param numGoles
     */
    
    public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
        this.numCamiseta = numCamiseta;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }
    
    /**
     * geters y setters
     */
    
    public int getNumCamiseta() {
        return numCamiseta;
    }
    
    public void setNumCamiseta(int numCamiseta) {
    	if (numCamiseta>0)
		this.numCamiseta = numCamiseta;
    	else {
    		System.out.println("DATO INCORRECTO CRACK");
    	}
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		if (edad>0)
			this.edad = edad;
	    	else {
	    		System.out.println("DATO INCORRECTO CRACK");
	    	}
	
	}

	public void setNumGoles(int numGoles) {
		if (numGoles>0)
			this.numGoles = numGoles;
	    	else {
	    		System.out.println("DATO INCORRECTO CRACK");
	    	}
		
	}

	public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public int getNumGoles() {
        return numGoles;
    }
   
    public boolean equals(Futbolista obj) {
        Futbolista other =obj;
        return this.numCamiseta == other.numCamiseta && this.nombre.equals(other.nombre);
    }
    
    //primero compara los numeros de la camiseta, implementando el compare que devuelve 0 si son iguales, un numero menor que 0
    // si el primero valor es menor que el segundo o un numero mayor que 0 si y es mayor que x
    @Override
    public int compareTo(Futbolista otroFutbolista) {
        int resultado = Integer.compare(this.numCamiseta, otroFutbolista.numCamiseta);
        if (resultado == 0) {
            resultado = this.nombre.compareTo(otroFutbolista.nombre);
            if (resultado == 0) {
                System.out.println("Los jugadores son iguales");
            }
        }
		return resultado;
    }
    //toString que muestra los juagadores
    @Override
    public String toString() {
        return "Futbolista :"+"\n"+"numCamiseta=" + numCamiseta + ", nombre=" + nombre +
        		", edad=" + edad + ", numGoles=" + numGoles;
    }
}
