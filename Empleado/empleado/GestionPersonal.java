package empleado;

import java.util.List;

public class GestionPersonal {

    public static void generarInforme(List<Empleado> empleados) {

        System.out.println("===== INFORME DE EMPLEADOS =====\n");

        for (Empleado e : empleados) {
            System.out.println(e.mostrarInformacion());
            System.out.println("----------------------------");
        }
    }
}