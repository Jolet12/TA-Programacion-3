public class Cubiculo extends EspacioUniversitario {
    private String codigo;
    private int capacidad;
    private TipoCubiculo tipoCubiculo;
    private AmbienteEstudio ambiente;

    public Cubiculo(int id, String codigo, int capacidad, TipoCubiculo tipoCubiculo, AmbienteEstudio ambiente) {
        super(id);
        this.codigo = codigo;
        this.capacidad = capacidad;
        this.tipoCubiculo = tipoCubiculo;
        this.ambiente = ambiente;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public TipoCubiculo getTipoCubiculo() {
        return tipoCubiculo;
    }

    public AmbienteEstudio getAmbiente() {
        return ambiente;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setTipoCubiculo(TipoCubiculo tipoCubiculo) {
        this.tipoCubiculo = tipoCubiculo;
    }

    public void setAmbiente(AmbienteEstudio ambiente) {
        this.ambiente = ambiente;
    }
}

enum TipoCubiculo {
    ConTelevisor, ConPizarra, SinEquipo
}

enum AmbienteEstudio {
    BibliotecaCentral, ComplejoDeInnovacionAcademica, Tinkuy;
}