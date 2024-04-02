public class ServicioPagable {
    private int id;
    private Pago pago;

    public ServicioPagable(int id, Pago pago) {
        this.id = id;
        this.pago = pago;
    }

    public int getId() {
        return id;
    }

    public Pago getPago() {
        return pago;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}
