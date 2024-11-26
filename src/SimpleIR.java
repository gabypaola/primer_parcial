public class SimpleIR {
    public  double C;
    discreteMathematics discreteMathematics = new discreteMathematics(); // instancia de discretMaths


    // formula para calcular el dividendo de B1
    // N*sumatoria(Xi Yi) - sumatoria(Xi) * sumatoria (Yi)

    public double dividendoB1(double[] X, double[] Y, int n){
        double resultado = discreteMathematics.NSumatoriaXiYi(X, Y, n) - (discreteMathematics.sumatoriaXi(X) * discreteMathematics.suamtoriaYi(Y));
        return resultado;
    }

    //(N * sumatoria X^2i )- ((sumatoria Xi)^2)

    public double divisorB1( double [] X, double [] Y, int n ){
        double resul = discreteMathematics.NsumatoriaXele2i(X,n) - (discreteMathematics.sumatoriaXiele2(X));
        return resul;
    }



    // formula para calcular el dividendo de B0
    // ((sumatoria X^2i)(sumatoria Yi) -(sumatoria Xi)(sumatoria Xi Yi))

    public double dividendoB0(double [] X, double[]Y,int n){
        double resultadoB0= (discreteMathematics.sumatoriaExponencialX(X,Y)*(discreteMathematics.suamtoriaYi(Y)))-
                (discreteMathematics.sumatoriaXi(X)*discreteMathematics.sumatoriaMultiplicacionXiYi(X,Y));
        return resultadoB0;
    }

    //((N * sumatoria X^2i)-((sumatoria Xi)^2))

    public double divisorB0(double [] X, double []Y, int n){
        double resulB0 = discreteMathematics.NsumatoriaXele2i(X,n)-(discreteMathematics.sumatoriaXiele2(X));
        return resulB0;
    }

    public double[] predicciones(double[] C) {
        double[] resultados = new double[C.length];
        for (int i = 0; i < C.length; i++) {
            double x1 = C[i];
            resultados[i] = 168 + 23 * x1;
        }
        return resultados;
    }


}
