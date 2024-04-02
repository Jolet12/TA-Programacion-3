public class Alumno extends Usuario {
  private TipoAlumno tipoAlumno;

  public Alumno(String codigo, String nombres, String apellidos, String contrasena, TipoAlumno tipoAlumno) {
    super(codigo, nombres, apellidos, contrasena);
    this.tipoAlumno = tipoAlumno;
  }

  public TipoAlumno getTipoAlumno() {
    return tipoAlumno;
  }

  public void setTipoAlumno(TipoAlumno tipoAlumno) {
    this.tipoAlumno = tipoAlumno;
  }
}

enum TipoAlumno {
  Reincorporado, Intercambio, Matriculado;
}