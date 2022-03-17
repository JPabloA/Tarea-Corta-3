package ClasesYObjetos;
import java.lang.Math;

public class Circulo extends Figura implements Comparable<Circulo> {
    
    private double radio;
    
    public Circulo(double radio){
    this.radio = radio;
    }
    
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    public int lados(){
        return 0;
    }
    
    public int compareTo(Circulo cirPorComparar){
        double areaPorComparar = cirPorComparar.calcularArea();
        double miArea = this.calcularArea();
        int ladosMiFigura = this.lados();
        int ladosPorComparar = cirPorComparar.lados();
        
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
