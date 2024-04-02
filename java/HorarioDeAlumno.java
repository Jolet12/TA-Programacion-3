import java.util.ArrayList;

public class HorarioDeAlumno {
    private ArrayList<Boolean> asistencias;
    private ArrayList<Integer> notasPB;
    private ArrayList<Integer> notasPA;
    private int notaE1;
    private int notaE2;
    private Alumno alumno;
    private HorarioDeCurso horarioDeCurso;

    public HorarioDeAlumno(ArrayList<Boolean> asistencias, ArrayList<Integer> notasPB, ArrayList<Integer> notasPA,
            int notaE1, int notaE2, Alumno alumno, HorarioDeCurso horarioDeCurso) {
        this.asistencias = asistencias;
        this.notasPB = notasPB;
        this.notasPA = notasPA;
        this.notaE1 = notaE1;
        this.notaE2 = notaE2;
        this.alumno = alumno;
        this.horarioDeCurso = horarioDeCurso;
    }

    public ArrayList<Boolean> getAsistencias() {
        return asistencias;
    }

    public ArrayList<Integer> getNotasPB() {
        return notasPB;
    }

    public ArrayList<Integer> getNotasPA() {
        return notasPA;
    }

    public int getNotaE1() {
        return notaE1;
    }

    public int getNotaE2() {
        return notaE2;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public HorarioDeCurso getHorarioDeCurso() {
        return horarioDeCurso;
    }

    public void setAsistencias(ArrayList<Boolean> asistencias) {
        this.asistencias = asistencias;
    }

    public void setNotasPB(ArrayList<Integer> notasPB) {
        this.notasPB = notasPB;
    }

    public void setNotasPA(ArrayList<Integer> notasPA) {
        this.notasPA = notasPA;
    }

    public void setNotaE1(int notaE1) {
        this.notaE1 = notaE1;
    }

    public void setNotaE2(int notaE2) {
        this.notaE2 = notaE2;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setHorarioDeCurso(HorarioDeCurso horarioDeCurso) {
        this.horarioDeCurso = horarioDeCurso;
    }
}