package empleado;
public class Administrativo extends Empleado {
    public int horasextra;
    public Administrativo(String cargo, String nombre, int id, double SalarioBase, int horasextra) {
        super(cargo, nombre, id, SalarioBase);
        
        this.horasextra = horasextra;
    }
    public double calcularHorasextra() {
    double valorHora = SalarioBase / 240;
    return horasextra * valorHora * 1.25;
}
    @Override
    public double calcularSalario() {
        return SalarioBase + calcularHorasextra();
    }
}