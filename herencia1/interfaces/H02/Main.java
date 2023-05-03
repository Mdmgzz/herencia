package H02;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Futbolista[] player = new Futbolista[5];
			player[0] = new Futbolista(10, "Modric", 34, 30);
			player[1] = new Futbolista(7, "Cristiano", 36, 25);
			player[2] = new Futbolista(9, "Benzema", 34, 20);
			player[3] = new Futbolista(20, "Vini", 29, 15);
			player[4] = new Futbolista(11, "Asensio", 22, 10);
	        
			
			
        System.out.println("Tabla sin ordenar:");
        for (Futbolista futbolista : player) {
            System.out.println(futbolista);
        }
        
        Arrays.sort(player);
        
        System.out.println("Tabla ordenada:");
        for (Futbolista futbolista : player) {
            System.out.println(futbolista);
        }

	}

}
