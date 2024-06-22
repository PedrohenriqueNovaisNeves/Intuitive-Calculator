package calculos;


public class calculoElevCubo {
    
    private double resultado;
    
    public calculoElevCubo(){
    }
    
    public void elev(double cubo){
        cubo = Math.pow(cubo, 3);
        resultado = cubo;
    }
    
    public double getResultado(){
        return resultado;
    }
}