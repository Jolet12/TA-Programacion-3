import java.util.ArrayList;

public class AmbienteEstudio {
  private String codigo;
  private int cantidadCubiculo;
  private int numPisos;
  private ArrayList<Cubiculo> cubiculos;

  public AmbienteEstudio(String codigo, int cantidadCubiculo, int numPisos) {
    this.codigo = codigo;
    this.cantidadCubiculo = cantidadCubiculo;
    this.numPisos = numPisos;
    this.cubiculos = new ArrayList<Cubiculo>();
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

  public ArrayList<Cubiculo> getCubiculos() {
    return cubiculos;
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

  public void setCubiculos(ArrayList<Cubiculo> cubiculos) {
    this.cubiculos = cubiculos;
  }
}
