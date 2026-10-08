package ejercicio02;
public class CalcularSuma {
    
    // atributos
    public float SUMA = 0;
    public float X = 20;
    public float Y = 40;


    public float calcularSuma() {
        SUMA = SUMA + X;
        X = X + (Y*Y);
        SUMA = SUMA + (X/Y);
        return (this.SUMA);
    }

    public static void main(String[] args) {
        CalcularSuma ejercicio = new CalcularSuma();
        System.out.println("La suma es: " + ejercicio.calcularSuma());
    }
}
