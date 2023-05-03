package H04;

public class Perro extends AnimalDomestico {
	  public Perro(String nombre, String raza, double peso, String color) {
	    super(nombre, raza, peso, color);
	  }

	  @Override
	  public void hacerRuido() {
	    System.out.println("Ladrio");
	  }

	  @Override
	  public void hacerCaso() {
	    // El perro hace caso el 90% de las veces
	   double caso;
	   caso=Math.random();
	   if (caso< 0.9) {
		   System.out.println("El perrete te hace caso");
	   }else {
		   System.out.println("El perrete no te quiere.");
	   }
	  }

	  public void sacarPaseo() {
	    System.out.println("Saca al perrico a paseah.");
	  }
	}