package ejercicio01;

public class CalcularEdades {
    
    // Atributos a usar
    private double EDJUAN;
    
    // Metodos 
    public double calcularEdalber() {
       return (2.0 / 3.0) * EDJUAN;
    }
    
    public double calcularEdana() {
       return (4.0 / 3.0) * EDJUAN;
    }
    
    public double calcularEdmama() {
        return calcularEdalber() + EDJUAN + calcularEdana();
    }

    // Get & Setter
    public double getEdjuan() {
        return this.EDJUAN;
    } 

    public void setEdjuan(double EDJUAN){
        this.EDJUAN = EDJUAN;
    }
}
