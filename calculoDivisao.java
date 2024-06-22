package calculos;


public class calculoDivisao {
    
    private double resultado;
    
    public calculoDivisao(){
    }
    
    public void dividir(double num1, double num2){
        double div = num1 / num2;
        this.resultado = div;
    }
    
    public double getResultado(){
        return resultado;
    }
}
