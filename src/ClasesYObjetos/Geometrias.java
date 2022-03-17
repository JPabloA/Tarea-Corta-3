package ClasesYObjetos;

import java.util.Arrays;

public class Geometrias {
    
    public static void main(String args[]){
        
        Rectangulo[] rects = new Rectangulo[4];
        Circulo[] circs = new Circulo[4];
        Triangulo[] triangs = new Triangulo[4];
        
        
        rects[0] = new Rectangulo(2.5,3.0);
        rects[1] = new Rectangulo(1.7,2.2);
        rects[2] = new Rectangulo(2.8, 3.1);
        rects[3] = new Rectangulo(3.5,1.2);
        Arrays.sort(rects);
        
        circs[0] = new Circulo(15);
        circs[1] = new Circulo(7);
        circs[2] = new Circulo(10);
        circs[3] = new Circulo(2);
        Arrays.sort(circs);
        
        triangs[0] = new Triangulo(20,30);
        triangs[1] = new Triangulo(10,5);
        triangs[2] = new Triangulo(15,15);
        triangs[3] = new Triangulo (30,50);
        Arrays.sort(triangs);
        
        
        // Pruebas
        System.out.println("\t\tPruebas");
        
        // Impresion del array de rectangulos
        System.out.println("\nLista de rectangulos");
        for (int i = 0; i < 4; i++){
            System.out.println(i+1 + ". El area del rectangulo actual es: " + rects[i].calcularArea());
        }
        
        //Impresion del array de circulos
        System.out.println("\nLista de circulos");
        for (int i = 0; i < 4; i++){
            System.out.println(i+1 + ". El area del circulo actual es: " + circs[i].calcularArea());
        }
        
        //Impresion del array de triangulos
        System.out.println("\nLista de triangulos");
        for (int i = 0; i < 4; i++){
            System.out.println(i+1 + ". El area del triangulo actual es: " + triangs[i].calcularArea());
        }
        
        
        
       
      
    }
    
}
