abstract class Empleado {

    private int dni;
    private String nombre;
    private String apellido;
    private int año;

    public Empleado(int dni, String nombre, String apellido, int año) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.año = año;
    }

    public Empleado() {
        this.dni = 0;
        this.nombre = "";
        this.apellido = "";
        this.año = 0;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public abstract void imprimir();
    public abstract double calcular_pago();
}
