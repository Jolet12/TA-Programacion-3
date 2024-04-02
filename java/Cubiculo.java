public class Cubiculo {
    private int id;
    private String codigo;
    private int capacidad;
    private TipoCubiculo tipoCubiculo;

    public Cubiculo(int id, String codigo, int capacidad, TipoCubiculo tipoCubiculo) {
        this.id = id;
        this.codigo = codigo;
        this.capacidad = capacidad;
        this.tipoCubiculo = tipoCubiculo;
    }

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
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
}

enum TipoCubiculo {
    ConTelevisor, ConPizarra, SinEquipo
}
