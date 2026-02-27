package empleado;
public class Gerente extends Empleado{
    public int bonoAnual;
    public Gerente(String cargo, String nombre, int id, double SalarioBase, int bonoAnual){
        super(cargo, nombre, id, SalarioBase);
        
        this.bonoAnual = bonoAnual;
    }
    public int getBonoAnual(){
        return bonoAnual;

    }
    @Override
    public double calcularSalario(){
        return SalarioBase + bonoAnual;
    }

}