import java.util.Date;

public class CuotaAcademica {
    private int nroCuota;
    private String ciclo;
    private float importe;
    private TipoMoneda tipoMoneda;
    private EstadoPago estadoPago;
    private Date vencimiento;
    private Date fechaPago;
    private Alumno alumno;

    public CuotaAcademica(int nroCuota, String ciclo, float importe, TipoMoneda tipoMoneda, EstadoPago estadoPago,
            Date vencimiento, Date fechaPago, Alumno alumno) {
        this.nroCuota = nroCuota;
        this.ciclo = ciclo;
        this.importe = importe;
        this.tipoMoneda = tipoMoneda;
        this.estadoPago = estadoPago;
        this.vencimiento = vencimiento;
        this.fechaPago = fechaPago;
        this.alumno = alumno;
    }

    public int getNroCuota() {
        return nroCuota;
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

    public Alumno getAlumno() {
        return alumno;
    }

    public void setNroCuota(int nroCuota) {
        this.nroCuota = nroCuota;
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

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}

enum TipoMoneda {
    PEN, USD, EUR
}

enum EstadoPago {
    PENDIENTE, PAGADO
}
