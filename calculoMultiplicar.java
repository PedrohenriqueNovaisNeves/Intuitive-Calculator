package calculos;


public class calculoMultiplicar {
    
    private double resultado;
    
    public calculoMultiplicar(){
        
    }
    
    public void multiplicar(double num1, double num2){
        double multi = num1 * num2;
        this.resultado = multi;
    }
    
    public double getResultado(){
        return resultado;
    }
}
