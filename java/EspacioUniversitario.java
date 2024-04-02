public class EspacioUniversitario {
    private String nombre;
    private String ubicacion;
    private EstadoEspacio estado;

    public EspacioUniversitario(String nombre, String ubicacion, EstadoEspacio estado) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.estado = estado;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setEstado(EstadoEspacio estado) {
        this.estado = estado;
    }
}

enum EstadoEspacio {
    Libre, Ocupado, Reservado
}
