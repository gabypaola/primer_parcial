public class resultado {
    public  double C;
    SimpleIR SimpleIR = new SimpleIR(); // instancia de discretMaths

    public double operacionB1(double []X, double []Y, int n){
        double resultadoOperacion = SimpleIR.dividendoB1(X,Y,n) / SimpleIR.divisorB1(X,Y,n);
        return  resultadoOperacion;
    }

    public  double operacionB0(double[]X, double []Y, int n){
        double resultadooperacionB0 = SimpleIR.dividendoB0(X,Y,n) / SimpleIR.divisorB0(X,Y,n);
        return resultadooperacionB0;
    }

    public double[] YdeHat(double[] X, double[] y, int n) {
        double[] resultados = new double[X.length];
        for (int i = 0; i < X.length; i++) {
            double x1 = X[i];
            resultados[i] = operacionB1(X, y, n) * x1 + operacionB0(X, y, n);
        }
        return resultados;
    }



}
