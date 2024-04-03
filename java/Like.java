import java.util.Date;

public class Like {
  private Date fecha;
  private Usuario usuario;
  private Plato plato;

  public Like(Date fecha, Usuario usuario, Plato plato) {
    this.fecha = fecha;
    this.usuario = usuario;
    this.plato = plato;
  }

  public Date getFecha() {
    return fecha;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public Plato getPlato() {
    return plato;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public void setPlato(Plato plato) {
    this.plato = plato;
  }
}
