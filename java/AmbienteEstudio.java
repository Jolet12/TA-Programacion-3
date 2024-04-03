public class AmbienteEstudio {
  private String codigo;
  private int cantidadCubiculo;
  private int numPisos;

  public AmbienteEstudio(String codigo, int cantidadCubiculo, int numPisos) {
    this.codigo = codigo;
    this.cantidadCubiculo = cantidadCubiculo;
    this.numPisos = numPisos;
  }

  public String getCodigo() {
    return codigo;
  }

  public int getCantidadCubiculo() {
    return cantidadCubiculo;
  }

  public int getNumPisos() {
    return numPisos;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  
  public void setCantidadCubiculo(int cantidadCubiculo) {
    this.cantidadCubiculo = cantidadCubiculo;
  }

  public void setNumPisos(int numPisos) {
    this.numPisos = numPisos;
  }
}
