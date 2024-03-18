import java.util.Scanner;

public class DocumentacionJavaDOC {
    
   
 /* Esta clase contiene el método main que inicia la aplicación.
 
public class Main {
    
    /**
     * Método principal que inicia la aplicación.
     * Se crean instancias de la clase Empleados, se dan de alta empleados,
     * se muestra la lista de empleados, se solicita un porcentaje de aumento
     * de salario al usuario, se aumenta el salario de los empleados y se muestra
     * la lista de empleados actualizada.
     * @param args Los argumentos de la línea de comandos (no se utilizan).
     
    public static void main(String[] args) {
        // Se crea una instancia de la clase Empleados
        Empleados empleados = new Empleados();

        // Se dan de alta empleados
        empleados.darDeAltaEmpleado("Juan", "Desarrollador", 50000);
        empleados.darDeAltaEmpleado("María", "Diseñadora", 45000);
        empleados.darDeAltaEmpleado("Pedro", "Gerente", 60000);

        // Se muestra la lista de empleados antes del aumento de salario
        empleados.mostrarEmpleados();

        // Se solicita al usuario el porcentaje de aumento de salario
        System.out.print("Introduzca el porcentaje de aumento de salario: ");
        double porcentaje = new Scanner(System.in).nextDouble();

        // Se aumenta el salario de los empleados
        empleados.aumentarSalario(porcentaje);

        // Se muestra la lista de empleados después del aumento de salario
        System.out.println("Lista de empleados después del aumento de salario:");
        empleados.mostrarEmpleados();
    }
}
     * 
     */


    /**
 * Esta clase representa un empleado con nombre, cargo y salario.
 
class Empleado {
    // Atributos
    
    /** Nombre del empleado. 
    private String nombre;
    
    /** Cargo del empleado. 
    private String cargo;
    
    /** Salario del empleado. 
    private double salario;

    // Constructor
    
    /**
     * Crea una nueva instancia de Empleado con el nombre, cargo y salario especificados.
     * @param nombre El nombre del empleado.
     * @param cargo El cargo del empleado.
     * @param salario El salario del empleado.
     
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Métodos
    
    /**
     * Devuelve una representación en forma de cadena de este objeto Empleado.
     * @return Una cadena que contiene el nombre, cargo y salario del empleado.
     
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

    /**
     * Obtiene el nombre del empleado.
     * @return El nombre del empleado.
     
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * @param nombre El nuevo nombre del empleado.
     
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el cargo del empleado.
     * @return El cargo del empleado.
     
    public String getCargo() {
        return cargo;
    }

    /**
     * Establece el cargo del empleado.
     * @param cargo El nuevo cargo del empleado.
     
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Obtiene el salario del empleado.
     * @return El salario del empleado.
     
    public double getSalario() {
        return salario;
    }

    /**
     * Establece el salario del empleado.
     * @param salario El nuevo salario del empleado.
     
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Aumenta el salario del empleado en el porcentaje especificado.
     * @param porcentaje El porcentaje de aumento del salario.
     
    public void aumentarSalario(double porcentaje) {
        this.salario *= (1 + porcentaje / 100);
    }
}





import java.util.ArrayList;

/**
 * Esta clase representa una lista de empleados y proporciona métodos para trabajar con ellos.
 
public class Empleados {
    // Atributos
    
    /** Lista de empleados. 
    private ArrayList<Empleado> lista;

    // Constructor
    
    /**
     * Crea una nueva instancia de Empleados con una lista vacía de empleados.
     
    public Empleados() {
        lista = new ArrayList<>();
    }

    // Métodos
    
    /**
     * Muestra la lista de empleados en la consola.
     * Cada empleado se imprime en una nueva línea utilizando su método toString().
     
    public void mostrarEmpleados() {
        System.out.println("Lista de empleados:");
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    /**
     * Aumenta el salario de todos los empleados en la lista por el porcentaje especificado.
     * @param porcentaje El porcentaje de aumento del salario.
     
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            empleado.aumentarSalario(porcentaje);
        }
    }

    /**
     * Agrega un nuevo empleado a la lista con el nombre, cargo y salario especificados.
     * @param nombre El nombre del nuevo empleado.
     * @param cargo El cargo del nuevo empleado.
     * @param salario El salario del nuevo empleado.
     
    public void darDeAltaEmpleado(String nombre, String cargo, double salario) {
        Empleado empleado = new Empleado(nombre, cargo, salario);
        lista.add(empleado);
    }
}
*/


/**
 * Esta clase proporciona constantes para mensajes de texto utilizados en la aplicación.
 
public class Textos {
    // Constantes
    
    /** Mensaje para indicar la lista de empleados. 
    public static final String LISTA_EMPLEADOS = "Lista de empleados:";
    
    /** Mensaje para solicitar al usuario que introduzca el porcentaje de aumento de salario.
    public static final String INTRODUCIR_PORCENTAJE = "Introduzca el porcentaje de aumento de salario: ";
    
    /** Mensaje para indicar la lista de empleados después del aumento de salario. 
    public static final String AUMENTO_SALARIO = "Lista de empleados después del aumento de salario:";
    
    /** Mensaje para solicitar al usuario que dé de alta a un nuevo empleado con su nombre, cargo y salario. 
    public static final String ALTA_EMPLEADO = "Dar de alta un empleado (nombre, cargo, salario): ";
    
    /** Mensaje para indicar la lista de empleados antes del aumento de salario. 
    public static final String LISTA_EMPLEADOS_ANTES = "Lista de empleados antes del aumento de salario:";
}





*/

}
