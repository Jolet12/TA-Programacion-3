import java.util.ArrayList;

public class EspacioUniversitario {
    private int id;
    private ArrayList<ReservaEspacioUniversitario> reservas;

    public EspacioUniversitario(int id) {
        this.id = id;
        this.reservas = new ArrayList<ReservaEspacioUniversitario>();
    }

    public int getId() {
        return id;
    }

    public ArrayList<ReservaEspacioUniversitario> getReservas() {
        return reservas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReservas(ArrayList<ReservaEspacioUniversitario> reservas) {
        this.reservas = reservas;
    }
}

enum EstadoEspacio {
    Libre, Ocupado, Reservado
}
