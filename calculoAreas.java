package calculos;

public class calculoAreas {

    private double resultadoQuadrado;

    private double resultadoRetangulo;

    private double resultadoTriangulo;

    private double resultadoCirculo;

    public calculoAreas() {
    }

    
    public void quadrado(double base, double altura) {
        double calculo = base * altura;
        resultadoQuadrado = calculo;
    }

    public double getResultadoQuadrado() {
        return resultadoQuadrado;
    }

    public void retangulo(double base, double altura){
        double calculo = base * altura;
        resultadoRetangulo = calculo;
    }
    
    public double getResultadoRetangulo(){
        return resultadoRetangulo;
    }
    
    public void triangulo(double base, double lado1, double lado2){
        double calculo = base + lado1 + lado2;
        resultadoTriangulo = calculo;
    }
    
    public double getResultadoTriangulo(){
        return resultadoTriangulo;
    }
    
    public void circulo(double p){
        double calculo = Math.PI*Math.pow(p, 2);
        resultadoCirculo = calculo;
    }
    
    public double getResultadoCirculo(){
        return resultadoCirculo;
    }
    
    public boolean validaQuadrado(double base, double altura){
        if((base < 0) || (altura < 0)){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean validaRetangulo(double base, double altura){
        if((base < 0) || (altura < 0)){
            return true;
        }else {
            return false;
        }
    }
    
    public boolean validaTriangulo(double base, double lado1, double lado2){
        if((base < 0) || (lado1 < 0) || (lado2 < 0)){
            return true;
        }else {
            return false;
        }
    }
    
    public boolean validaCirculo(double p){
        if(p < 0){
            return true;
        }else{
            return false;
        }
    }
}