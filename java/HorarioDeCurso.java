import java.util.ArrayList;

public class HorarioDeCurso {
    private String codigo;
    private int horaInicio;
    private int minutoInicio;
    private int horaFinal;
    private int minutoFinal;
    private ArrayList<DiaSemana> dias;
    private String ubicacion;
    private Curso curso;
    private ArrayList<HorarioDeAlumno> horarios;
    private Docente docente;

    public HorarioDeCurso(String codigo, int horaInicio, int minutoInicio, int horaFinal, int minutoFinal,
            ArrayList<DiaSemana> dias, String ubicacion, Curso curso, Docente docente) {
        this.codigo = codigo;
        this.horaInicio = horaInicio;
        this.minutoInicio = minutoInicio;
        this.horaFinal = horaFinal;
        this.minutoFinal = minutoFinal;
        this.dias = dias;
        this.ubicacion = ubicacion;
        this.curso = curso;
        this.docente = docente;
        this.horarios = new ArrayList<HorarioDeAlumno>();
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

    public Curso getCurso() {
        return curso;
    }

    public ArrayList<HorarioDeAlumno> getHorarios() {
        return horarios;
    }

    public Docente getDocente() {
        return docente;
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

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setHorarios(ArrayList<HorarioDeAlumno> horarios) {
        this.horarios = horarios;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}

enum DiaSemana {
    Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo;
}
