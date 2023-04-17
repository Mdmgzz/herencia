package ejer1;

public class HoraExacta extends Hora{
	protected int segundos=0;
	
	
	HoraExacta(int hora, int minutos, int segundos){
		super(hora,minutos);
		this.segundos=segundos;
	}
	
	void setSegundos(int valor) {
		
		if (valor<60 && valor>=0) {
			segundos=valor;
		}
		
	}
	
	@Override
	void inc(){
		segundos++;
		if (segundos>=60) {
			segundos=0;
			super.inc();
		}
		
	}
	
	@Override
	public String  toString() {
		String cadena="";
		
		if (segundos <10 && segundos>0) {
			cadena+="0";
		}
		cadena+=segundos;
	
		return cadena;
	}
}
