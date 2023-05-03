package ejer03;

public class Main {

	public static void main(String[] args) {
		 String array[]= {"Manzana","Tenedor","Lentejas","LataConservas","Uva"};
		 
		  
		 // de esta manera muestra todos las opciones del array 
		 
		 for (int i=0;i<array.length;i++) {
			 
			 switch (array[i]) {
			 case "Manzana":{
				 Perecedero pe= new Perecedero("Manzana",2,3);
				 System.out.println(pe.calcular(30));
				 break;
			 	}
				 
			 case "Uva":{
				 Perecedero pe= new Perecedero("UVA",1,3);
				 System.out.println(pe.calcular(30));
				 break;
			 	}
			 
			 case "Tenedor":{
				 Productos pe= new Productos("Tenedor",5);
				 System.out.println( pe.calcular(4));
				 break;
			 }
			 case "LataConservas":{
				 NoPerecedero pe= new NoPerecedero("LataConservas",6);
				 System.out.println(pe.calcular(30));
				 break;
			 }
			 case "Lentejas":{
				 NoPerecedero pe= new NoPerecedero("Lentejas",0.5);
				 System.out.println(pe.calcular(30));
				 break;
			 }
			 }
		 }

	}
}
