import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[4];
        Scanner scanner = new Scanner(System.in);

        Empleado empleadoA1 = new Asalariado(466908881, "Javier", "Gomez", 10, 1200);
        Empleado empleadoC1 = new  Comision(695235, "Eva", "Nieto", 6, 0, 179, 8.10);

        Asalariado empleadoA2 = new Asalariado();


        System.out.printf("Ingresa el nombre: ");
        String nombre = scanner.nextLine();
        empleadoA2.setNombre(nombre);

        scanner.nextLine();

        System.out.println("Ingresa el apellido");
        String apellido = scanner.nextLine();
        empleadoA2.setApellido(apellido); // Aquí se corrige setNombre() por setApellido()

        scanner.nextLine();

        System.out.printf("Ingresa el dni: ");
        int dni = scanner.nextInt();
        empleadoA2.setDni(dni);

        System.out.printf("Ingresa años de trabajo: ");
        int año = scanner.nextInt();
        empleadoA2.setAño(año);

        System.out.printf("Ingresa el salario: ");
        double salario = scanner.nextDouble();
        empleadoA2.setSalario(salario);

        empleadoA2.imprimir();



        /*empleados[0] = empleadoA1;
        empleados[1] = empleadoC1;



        for(int i = 0; i < 4; i++) {
            empleados[i].calcular_pago();
            empleados[i].imprimir();
        }*/



    }
}