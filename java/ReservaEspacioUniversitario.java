import java.util.Date;

public class ReservaEspacioUniversitario {
    private EspacioUniversitario espacio;
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private String motivo;

    public ReservaEspacioUniversitario(EspacioUniversitario espacio, Date fechaHoraInicio, Date fechaHoraFin,
            String motivo) {
        this.espacio = espacio;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.motivo = motivo;
    }

    public EspacioUniversitario getEspacio() {
        return espacio;
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

    public void setEspacio(EspacioUniversitario espacio) {
        this.espacio = espacio;
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
}
