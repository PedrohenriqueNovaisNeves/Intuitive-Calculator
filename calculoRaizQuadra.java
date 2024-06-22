package calculos;


public class calculoRaizQuadra {
    
    private double resultado;
    
    public calculoRaizQuadra(){
    }
    
    public void raiz(double num){
        double raiz = Math.sqrt(num);
        resultado = raiz;
    }
    
    public double getResultado(){
        return resultado;
    }
}
