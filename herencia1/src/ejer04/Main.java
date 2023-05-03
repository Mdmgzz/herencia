package ejer04;

public class Main {

	public static void main(String[] args) {
   
        //Creamos los objetos de las clases Electrodomestico, Lavadora y Television
        Electrodomestico ele1 = new Electrodomestico();
        Electrodomestico ele2 = new Electrodomestico(100, 30,'A',"rojo");
        Electrodomestico ele3 = new Electrodomestico(400, 40);
        
        
        Electrodomestico lav1 = new Lavadora();
        Electrodomestico lav2 = new Lavadora(300,"azul",'A',40,40);
        Electrodomestico lav3 = new Lavadora(340, 50, 60);
        
        
        Electrodomestico tel1 = new Television();
        Electrodomestico tel2 = new Television(410, "negro", 'C',30, 40, false);
        Electrodomestico tel3 = new Television(300, 60, 70, true);
        
        System.out.println(ele2);
	}

}
