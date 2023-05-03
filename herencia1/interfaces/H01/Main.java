package H01;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		 Socio[] socios = new Socio[3];
		    socios[0] = new Socio(2, "Juan", 16);
		    socios[1] = new Socio(1, "Pedro", 15);
		    socios[2] = new Socio(3, "Javi", 28);

		    System.out.println("Socios sin ordenar:");
		    for (Socio socio : socios) {
		        System.out.println(socio);
		    }

		    Arrays.sort(socios);
		    System.out.println();
		    System.out.println("Socios ordenados por ID:");
		    for (Socio socio : socios) {
		        System.out.println(socio);
		    }

	}
}
