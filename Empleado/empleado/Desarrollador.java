package empleado;
public class Desarrollador extends Empleado{
    public int proyecto;
        public Desarrollador(String cargo, String nombre, int id, double SalarioBase, int proyecto) {
            super(cargo, nombre, id, SalarioBase);  
        
            this.proyecto = proyecto;
        }
    @Override
        public double calcularSalario() {
            return SalarioBase + proyecto ;
        }
    }
