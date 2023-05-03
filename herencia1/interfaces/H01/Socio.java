package H01;

public class Socio implements Comparable<Socio> {
    private int id;
    private String nombre;
    private int edad;
    
    public Socio(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Socio :"+"\n"+"id=" + id + ", nombre=" + nombre + ", edad=" + edad;
    }
    
    @Override
    public int compareTo(Socio o) {
        return Integer.compare(this.id, o.id);
    }
    
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
}
