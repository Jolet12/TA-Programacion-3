import java.util.Date;

public class CoutaAcademica {
    private int nroCouta;
    private String ciclo;
    private float importe;
    private TipoMoneda tipoMoneda;
    private EstadoPago estadoPago;
    private Date vencimiento;
    private Date fechaPago;

    public CoutaAcademica(int nroCouta, String ciclo, float importe, TipoMoneda tipoMoneda, EstadoPago estadoPago,
            Date vencimiento, Date fechaPago) {
        this.nroCouta = nroCouta;
        this.ciclo = ciclo;
        this.importe = importe;
        this.tipoMoneda = tipoMoneda;
        this.estadoPago = estadoPago;
        this.vencimiento = vencimiento;
        this.fechaPago = fechaPago;
    }

    public int getNroCouta() {
        return nroCouta;
    }

    public String getCiclo() {
        return ciclo;
    }

    public float getImporte() {
        return importe;
    }

    public TipoMoneda getTipoMoneda() {
        return tipoMoneda;
    }

    public EstadoPago getEstadoPago() {
        return estadoPago;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setNroCouta(int nroCouta) {
        this.nroCouta = nroCouta;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public void setTipoMoneda(TipoMoneda tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public void setEstadoPago(EstadoPago estadoPago) {
        this.estadoPago = estadoPago;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

}

enum TipoMoneda {
    PEN, USD, EUR
}

enum EstadoPago {
    PENDIENTE, PAGADO
}