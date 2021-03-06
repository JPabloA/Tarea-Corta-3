package ClasesYObjetos;

public class Triangulo extends Figura implements Comparable<Triangulo>{
    
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea(){
        return base * altura / 2;
    }
    
    public int lados(){
        return 3;
    }
    
    public int compareTo(Triangulo triPorComparar){
        double areaPorComparar = triPorComparar.calcularArea();
        double miArea = this.calcularArea();
        int ladosMiFigura = this.lados();
        int ladosPorComparar = triPorComparar.lados();
        
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
