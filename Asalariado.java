public class Asalariado extends Empleado{

    private double salario;


    public Asalariado(int dni, String nombre, String apellido, int año, double salario) {
        super(dni, nombre, apellido, año);
        this.salario = salario;
    }

    public Asalariado() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimir()
    {
        System.out.printf("\n Nombre: " + this.getNombre());
        System.out.printf("\n Apellido: " + this.getApellido());
        System.out.printf("\n Documento: " + this.getDni());
        System.out.printf("\n Año: " + this.getAño());
        System.out.printf("\n Salario: " + salario);
    }
    public double calcular_pago() {

        if(this.getAño() == 3)
        {
            salario = salario * 1.05;
        }
        else if(this.getAño() >= 4 && getAño() <= 7)
        {
            salario = salario * 1.10;
        }
        else if(this.getAño() > 7 && this.getAño() <= 15)
        {
            salario = salario * 1.15;
        }
        else
        {
            salario = salario * 1.20;
        }

        return salario;
    }

}
