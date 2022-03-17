package ClasesYObjetos;

public class Rectangulo extends Figura implements Comparable<Rectangulo> {
    
    private double base;
    private double altura;
    
    public Rectangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }
    
    // Implementacion del metodo abstracto
    public double calcularArea() {
        return base*altura;
    }
    
    public int lados(){
        return 4;
    }
    
    // Implementacion del metodo compareTo
    public int compareTo(Rectangulo rectPorComparar){
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();
        int ladosMiFigura = this.lados();
        int ladosPorComparar = rectPorComparar.lados();
        
        if (miArea == areaPorComparar && ladosMiFigura == ladosPorComparar){
            return 0;
        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
    }
}
