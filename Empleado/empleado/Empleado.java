package empleado;
public class Empleado {
    public String cargo ;
    public String nombre;
    public int id;
    public double SalarioBase;
    public Empleado(String cargo, String nombre, int id, double SalarioBase){
        this.cargo = cargo;
        this.nombre = nombre;
        this.id = id;
        this.SalarioBase = SalarioBase;
    }
    public double getSalarioBase(){
        return SalarioBase;
    }
    public double calcularSalario(){
        return SalarioBase;
    }
    public String mostrarInformacion() {
        return  "===="+ cargo+ "====\n" +
               "Nombre: " + nombre +
               "\nID: " + id +
               "\nSalario: " + calcularSalario();
    }
}

