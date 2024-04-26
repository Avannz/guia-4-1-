public class Comision extends Empleado {

    private double salario;
    private int numero_clientes;
    private double precio_cliente;

    public Comision(int dni, String nombre, String apellido, int año, double salario, int numero_clientes, double precio_cliente) {
        super(dni, nombre, apellido, año);
        this.salario = salario;
        this.numero_clientes = numero_clientes;
        this.precio_cliente = precio_cliente;
    }

    public Comision() {
        this.salario = 0;
        this.numero_clientes = 0;
        this.precio_cliente = 0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumero_clientes() {
        return numero_clientes;
    }

    public void setNumero_clientes(int numero_clientes) {
        this.numero_clientes = numero_clientes;
    }

    public double getPrecio_cliente() {
        return precio_cliente;
    }

    public void setPrecio_cliente(double precio_cliente) {
        this.precio_cliente = precio_cliente;
    }

    public void imprimir() {
        System.out.printf("\n Nombre: " + this.getNombre());
        System.out.printf("\n Apellido: " + this.getApellido());
        System.out.printf("\n Documento: " + this.getDni());
        System.out.printf("\n Año: " + this.getAño());
        System.out.printf("\n Salario: " + salario);
    }
    public double calcular_pago() {
        salario = numero_clientes * precio_cliente;

        if(salario < 750.0)
        {
            salario = 750.0;
        }

        return salario;
    }
}
