package ejer1;

public class HoraExacta extends Hora{
	protected int segundos=0;
	
	Hora h= new Hora();
	
	HoraExacta(int hora, int minutos, int segundos){
		h.hora=hora;
		h.minutos=minutos;
		this.segundos=segundos;
	}
	boolean setsetSegundos(int valor) {
		boolean intento = false;
		if (valor<60 && valor>=0) {
			segundos=valor;
			intento=true;
		}
		return intento;
		
	}
	
	void inc(){
		segundos++;
		if (segundos>=60) {
			segundos=0;
			h.inc();
		}
		
	}
	
}
