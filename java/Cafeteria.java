import java.util.ArrayList;

public class Cafeteria {
    private int id;
    private String nombre;
    private String descripcion;
    private String ubicacion;
    private String imagen;
    private ArrayList<Plato> platos;

    public Cafeteria(int id, String nombre, String descripcion, String ubicacion, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.imagen = imagen;
        this.platos = new ArrayList<Plato>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getImagen() {
        return imagen;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }
}
