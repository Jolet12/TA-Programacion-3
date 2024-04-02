import java.util.ArrayList;

public class AmbienteEstudio {
    private String nombre;
    private ArrayList<Cubiculo> cubiculos;

    public AmbienteEstudio(String nombre) {
        this.nombre = nombre;
        this.cubiculos = new ArrayList<Cubiculo>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cubiculo> getCubiculos() {
        return cubiculos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCubiculos(ArrayList<Cubiculo> cubiculos) {
        this.cubiculos = cubiculos;
    }
}
