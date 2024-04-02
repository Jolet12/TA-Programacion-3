public class Plato {
    private int id;
    private String nombre;
    private String descripcion;
    private float precio;
    private String imagen;
    private int stock;
    private int likes;

    public Plato(int id, String nombre, String descripcion, float precio, String imagen, int stock, int likes) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
        this.stock = stock;
        this.likes = likes;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public String getImagen() {
        return imagen;
    }

    public int getStock() {
        return stock;
    }

    public int getLikes() {
        return likes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
