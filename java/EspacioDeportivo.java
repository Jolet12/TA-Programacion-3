public class EspacioDeportivo extends EspacioUniversitario {
    private String nombre;

    public EspacioDeportivo(int id, String nombre) {
        super(id);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
