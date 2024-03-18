package examen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleados empleados = new Empleados();

        empleados.darDeAltaEmpleado("Juan", "Desarrollador", 50000);
        empleados.darDeAltaEmpleado("María", "Diseñadora", 45000);
        empleados.darDeAltaEmpleado("Pedro", "Gerente", 60000);

        empleados.mostrarEmpleados();

        System.out.print("Introduzca el porcentaje de aumento de salario: ");
        double porcentaje = new Scanner (System.in).nextDouble();

        empleados.aumentarSalario(porcentaje);

        System.out.println("Lista de empleados después del aumento de salario:");
        empleados.mostrarEmpleados();
    }
}