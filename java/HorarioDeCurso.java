import java.util.ArrayList;

public class HorarioDeCurso {
    private String codigo;
    private int horaInicio;
    private int minutoInicio;
    private int horaFinal;
    private int minutoFinal;
    private ArrayList<DiaSemana> dias;
    private String ubicacion;

    public HorarioDeCurso(String codigo, int horaInicio, int minutoInicio, int horaFinal, int minutoFinal,
            ArrayList<DiaSemana> dias, String ubicacion) {
        this.codigo = codigo;
        this.horaInicio = horaInicio;
        this.minutoInicio = minutoInicio;
        this.horaFinal = horaFinal;
        this.minutoFinal = minutoFinal;
        this.dias = dias;
        this.ubicacion = ubicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getMinutoInicio() {
        return minutoInicio;
    }

    public int getHoraFinal() {
        return horaFinal;
    }

    public int getMinutoFinal() {
        return minutoFinal;
    }

    public ArrayList<DiaSemana> getDias() {
        return dias;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setMinutoInicio(int minutoInicio) {
        this.minutoInicio = minutoInicio;
    }

    public void setHoraFinal(int horaFinal) {
        this.horaFinal = horaFinal;
    }

    public void setMinutoFinal(int minutoFinal) {
        this.minutoFinal = minutoFinal;
    }

    public void setDias(ArrayList<DiaSemana> dias) {
        this.dias = dias;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}

enum DiaSemana {
    Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo;
}
