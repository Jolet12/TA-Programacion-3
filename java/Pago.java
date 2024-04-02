import java.util.Date;

public class Pago {
    private int id;
    private EstadoPago estadoPago;
    private Date fechaHora;
    private ServicioPagable servicio;
    private Usuario usuario;

    public Pago(int id, EstadoPago estadoPago, Date fechaHora, ServicioPagable servicio, Usuario usuario) {
        this.id = id;
        this.estadoPago = estadoPago;
        this.fechaHora = fechaHora;
        this.servicio = servicio;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public EstadoPago getEstadoPago() {
        return estadoPago;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public ServicioPagable getServicio() {
        return servicio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEstadoPago(EstadoPago estadoPago) {
        this.estadoPago = estadoPago;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setServicio(ServicioPagable servicio) {
        this.servicio = servicio;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
