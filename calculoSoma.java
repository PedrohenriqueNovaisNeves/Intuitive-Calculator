package calculos;


public class calculoSoma {
    
    private double resultado;
    
    public calculoSoma(){
        
    }
    
    public void Somar(double num1, double num2){
        double soma = num1 + num2;
        this.resultado = soma;
    }
    
    public double getResultado(){
        return resultado;
    }
}