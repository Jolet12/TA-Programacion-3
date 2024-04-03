import java.util.ArrayList;

public class Alumno extends Usuario {
  private TipoAlumno tipoAlumno;
  private ArrayList<HorarioDeAlumno> horarios;
  private ArrayList<CuotaAcademica> cuotas;

  public Alumno(String codigo, String nombres, String apellidos, String contrasena, TipoAlumno tipoAlumno) {
    super(codigo, nombres, apellidos, contrasena);
    this.tipoAlumno = tipoAlumno;
    this.horarios = new ArrayList<HorarioDeAlumno>();
    this.cuotas = new ArrayList<CuotaAcademica>();
  }

  public TipoAlumno getTipoAlumno() {
    return tipoAlumno;
  }

  public ArrayList<HorarioDeAlumno> getHorarios() {
    return horarios;
  }

  public ArrayList<CuotaAcademica> getCuotas() {
    return cuotas;
  }

  public void setTipoAlumno(TipoAlumno tipoAlumno) {
    this.tipoAlumno = tipoAlumno;
  }

  public void setHorarios(ArrayList<HorarioDeAlumno> horarios) {
    this.horarios = horarios;
  }

  public void setCuotas(ArrayList<CuotaAcademica> cuotas) {
    this.cuotas = cuotas;
  }
}

enum TipoAlumno {
  Reincorporado, Intercambio, Matriculado;
}
