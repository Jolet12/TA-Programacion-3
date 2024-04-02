import java.util.Date;

public class ReservaEspacioUniversitario {
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private String motivo;
    private EspacioUniversitario espacio;
    private Usuario usuario;

    public ReservaEspacioUniversitario(Date fechaHoraInicio, Date fechaHoraFin,
            String motivo, EspacioUniversitario espacio, Usuario usuario) {
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.motivo = motivo;
        this.espacio = espacio;
        this.usuario = usuario;
    }

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public Date getFechaHoraFin() {
        return fechaHoraFin;
    }

    public String getMotivo() {
        return motivo;
    }

    public EspacioUniversitario getEspacio() {
        return espacio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public void setFechaHoraFin(Date fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setEspacio(EspacioUniversitario espacio) {
        this.espacio = espacio;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
