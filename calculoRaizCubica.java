package calculos;

public class calculoRaizCubica {

    private double resultado;

    public calculoRaizCubica() {
    }

    public void raiz(double num) {
        double cub = Math.cbrt(num);
        resultado = cub;
    }

    public double getResultado() {
        return resultado;
    }
}
