public class EspacioDeportivo extends EspacioUniversitario {
    private String nombre;

    public EspacioDeportivo(String nombre, String ubicacion, EstadoEspacio estado) {
        super(nombre, ubicacion, estado);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
