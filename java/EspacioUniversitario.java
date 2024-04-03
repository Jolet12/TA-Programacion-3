import java.util.ArrayList;

public class EspacioUniversitario {
    private int id;
    private String ubicacion;
    private ArrayList<ReservaEspacioUniversitario> reservas;

    public EspacioUniversitario(int id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.reservas = new ArrayList<ReservaEspacioUniversitario>();
    }

    public int getId() {
        return id;
    }

    public String getUbicacion() {
      return ubicacion;  
    }

    public ArrayList<ReservaEspacioUniversitario> getReservas() {
        return reservas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUbicacion(String ubicacion) {
      this.ubicacion = ubicacion;
    }

    public void setReservas(ArrayList<ReservaEspacioUniversitario> reservas) {
        this.reservas = reservas;
    }
}

