package calculos;


public class calculoSubtrair {
    
    private double resultado;
    
    public void subtrair(double num1, double num2){
        double sub = num1 - num2;
        this.resultado = sub;
    }
    
    public double getResultado(){
     return resultado;   
    }
}
