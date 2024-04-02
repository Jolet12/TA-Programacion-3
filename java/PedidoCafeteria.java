import java.util.Date;

public class PedidoCafeteria {
    private int id;
    private Date fechaHora;

    public PedidoCafeteria(int id, Date fechaHora) {
        this.id = id;
        this.fechaHora = fechaHora;
    }

    public int getId() {
        return id;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
}
