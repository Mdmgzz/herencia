package H04;

public class Gato extends AnimalDomestico {
	  public Gato(String nombre, String raza, double peso, String color) {
	    super(nombre, raza, peso, color);
	  }

	  @Override
	  public void hacerRuido() {
	    System.out.println("Maullido");
	  }

	  @Override
	  public void hacerCaso() {
		  double caso;
		   caso=Math.random();
		   if (caso< 0.6) {
			   System.out.println("El gatillo te hace caso.");
		   }else {
			   System.out.println("El gatillo no te hace caso colega.");
		   }
		  }

	  // metodo para toser bola de pelo
	  public void toserBolaPelo() {
	    System.out.println("Ha escupio un bolondrio de pelo uuugh");
	}
	  
}
