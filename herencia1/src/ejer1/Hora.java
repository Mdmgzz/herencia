package ejer1;

public class Hora {
	public int hora=0;
	protected int minutos=0;
	
	
	
	public Hora (int hora,int minutos) {
		this.hora=hora;
		this.minutos=minutos;
	}
	
	public Hora() {
	}

	void inc() {
		this.minutos++;
		if (minutos>=60) {
			minutos=0;
			hora++;
		}else if (hora>=24) {
			hora=0;
		}
	}
	
	boolean setMinutos(int valor) {
		boolean intento = false;
		if (valor<60 && valor>=0) {
			minutos=valor;
			intento=true;
		}
		return intento;
		
	}
	
	
	boolean setHora(int valor) {
		boolean intento = false;
		if (valor<60 && valor>=0) {
			hora=valor;
			intento=true;
		}
		return intento;
		
	}
	
	public String  toString() {
		String cadena="";
		String h="";
		String m="";
		h="HORA: "+hora;
		m="MINUTOS: "+minutos;
		cadena=h+" "+m;
		return cadena;
	}
}
