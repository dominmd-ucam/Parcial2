

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleados empleados = new Empleados();

        System.out.println(Textos.ALTA_EMPLEADO);
        empleados.darDeAltaEmpleado("Juan", "Desarrollador", 50000);
        empleados.darDeAltaEmpleado("María", "Diseñadora", 45000);
        empleados.darDeAltaEmpleado("Pedro", "Gerente", 60000);

        empleados.mostrarEmpleados();

        System.out.println(Textos.INTRODUCIR_PORCENTAJE);
        double porcentaje = new Scanner (System.in).nextDouble();

        empleados.aumentarSalario(porcentaje);

        System.out.println(Textos.AUMENTO_SALARIO);
        empleados.mostrarEmpleados();
    }
}