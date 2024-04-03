import java.util.ArrayList;

public class Docente extends Usuario {
    private TipoDocente tipoDocente;
    private ArrayList<HorarioDeCurso> horarios;

    public Docente(String codigo, String nombres, String apellidos, String contrasena, TipoDocente tipoDocente) {
        super(codigo, nombres, apellidos, contrasena);
        this.tipoDocente = tipoDocente;
        this.horarios = new ArrayList<>();
    }

    public TipoDocente getTipoDocente() {
        return tipoDocente;
    }

    public ArrayList<HorarioDeCurso> getHorarios() {
        return horarios;
    }

    public void setTipoDocente(TipoDocente tipoDocente) {
        this.tipoDocente = tipoDocente;
    }

    public void setHorarios(ArrayList<HorarioDeCurso> horarios) {
        this.horarios = horarios;
    }
}

enum TipoDocente {
    TiempoParcial,
    TiempoCompleto;
}
