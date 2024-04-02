public class Curso {
    private String clave;
    private String nombre;
    private Curso curso;

    public Curso(String clave, String nombre, Curso curso) {
        this.clave = clave;
        this.nombre = nombre;
        this.curso = curso;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
