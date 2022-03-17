package ClasesYObjetos;

//figura es abstract porque tiene al menos un m todo abstracto
public abstract class Figura {
    // El siguiente metodo es abstracto porque no poedmos calcular el area
    // sin saber de que figura se trata
    public abstract double calcularArea();
}
