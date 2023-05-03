package H04;

interface Animal {
    void comer();
	void dormir();
    void hacerRuido();
}

class AnimalDomestico implements Animal {
    protected String nombre; // variable que guarda el nombre del animal
    private String raza;	// guarda la raza del animal
    private double peso;	// el peso del animal
    private String color;	// colo del animal

    // constructor con parametros
    public AnimalDomestico(String nombre, String raza, double peso, String color) {
        this.nombre = nombre;
        this.setRaza(raza);
        this.setPeso(peso);
        this.setColor(color);
    }
    //getters y stters
    
    public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

    /**
     * Metodo para ver si es vacunado o no
     */
    public void vacunar() {
        System.out.println(nombre + " ha sido vacunado.");
    }

    /**
     * Metodo para ver si esta haciendo caso
     */
    public void hacerCaso() {
        System.out.println(nombre + " está haciendo caso.");
    }

    /**
     * Metodo para ver si come
     */
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    /**
     * Metodo para si duerme
     */
    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    /**
     * Metodo para ver si esta haciendo ruido
     */
    public void hacerRuido() {
        System.out.println(nombre + " está haciendo ruido.");
    }
	
}
