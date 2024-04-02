import java.util.ArrayList;
import java.util.Date;

public class ReservaCafeteria {
    private int id;
    private Date fechaHora;
    private Plato plato;
    private Cafeteria cafeteria;
    private ArrayList<Usuario> usuarios;

    public ReservaCafeteria(int id, Date fechaHora, Plato plato, Cafeteria cafeteria) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.plato = plato;
        this.cafeteria = cafeteria;
        this.usuarios = new ArrayList<Usuario>();
    }

    public int getId() {
        return id;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public Plato getPlato() {
        return plato;
    }

    public Cafeteria getCafeteria() {
        return cafeteria;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public void setCafeteria(Cafeteria cafeteria) {
        this.cafeteria = cafeteria;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
