package examen;

import java.util.ArrayList;

public class Empleados {
    private ArrayList<Empleado> lista;

    public Empleados() {
        lista = new ArrayList<>();
    }

    public void mostrarEmpleados() {
        System.out.println("Lista de empleados:");
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
           empleado.aumentarSalario(porcentaje);
        }
    }

    public void darDeAltaEmpleado(String nombre, String cargo, double salario) {
        Empleado empleado = new Empleado(nombre, cargo, salario);
        lista.add(empleado);
    }
}
