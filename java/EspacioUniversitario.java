import java.util.ArrayList;

public class EspacioUniversitario {
    private String nombre;
    private String ubicacion;
    private EstadoEspacio estado;
    private ArrayList<ReservaEspacioUniversitario> reservas;

    public EspacioUniversitario(String nombre, String ubicacion, EstadoEspacio estado) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.reservas = new ArrayList<ReservaEspacioUniversitario>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public EstadoEspacio getEstado() {
        return estado;
    }

    public ArrayList<ReservaEspacioUniversitario> getReservas() {
        return reservas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setEstado(EstadoEspacio estado) {
        this.estado = estado;
    }

    public void setReservas(ArrayList<ReservaEspacioUniversitario> reservas) {
        this.reservas = reservas;
    }
}

enum EstadoEspacio {
    Libre, Ocupado, Reservado
}
