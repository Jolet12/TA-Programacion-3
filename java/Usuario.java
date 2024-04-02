abstract public class Usuario implements IConsultableHorario {
  private String codigo;
  private String nombres;
  private String apellidos;
  private String contrasena;

  public Usuario(String codigo, String nombres, String apellidos, String contrasena) {
    this.codigo = codigo;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.contrasena = contrasena;
  }

  public String getCodigo() {
    return codigo;
  }

  public String getNombres() {
    return nombres;
  }

  public String getApellidos() {
    return apellidos;
  }

  public String getContrasena() {
    return contrasena;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }

  public String consultarHorario() {
    return "Horario de clases del alumno";
  }
}
