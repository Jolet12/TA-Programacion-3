public class Docente extends Usuario {
    private TipoDocente tipoDocente;

    public Docente(String codigo, String nombres, String apellidos, String contrasena, TipoDocente tipoDocente) {
        super(codigo, nombres, apellidos, contrasena);
        this.tipoDocente = tipoDocente;
    }

    public TipoDocente getTipoDocente() {
        return tipoDocente;
    }

    public void setTipoDocente(TipoDocente tipoDocente) {
        this.tipoDocente = tipoDocente;
    }
}

enum TipoDocente {
    TiempoParcial,
    TiempoCompleto;
}