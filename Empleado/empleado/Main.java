package empleado;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    List<Empleado> empleados = new ArrayList<>();
    empleados.add(new Gerente("Gerente", "Luis", 1, 5000000.0, 1000000));
    empleados.add(new Desarrollador("Desarrollador", "Ana", 2, 3000000.0, 3));
    empleados.add(new Administrativo("Administrativo", "Carlos", 3, 2000000.0, 10));

        GestionPersonal.generarInforme(empleados);
    }
}