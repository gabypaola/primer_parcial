import jade.core.Agent;

public class AgenteSmith extends Agent{

    public void setup(){
        DataSet data = new DataSet();

        discreteMathematics discret = new discreteMathematics();

        SimpleIR prediccion = new SimpleIR();

        resultado resul =new resultado();

        double[] C = data.C;
        double[] X = data.X;
        double[] Y = data.y;

        double sumatoriaMultiplicacionXiYi = discret.sumatoriaMultiplicacionXiYi(X, Y);
        double sumatoriaExponencialX = discret.sumatoriaExponencialX(X , Y);
        double NSumatoriaXiYi = discret.NSumatoriaXiYi(X, Y, data.n);
        double sumatoriaXi = discret.sumatoriaXi(X);
        double suamtoriaYi = discret.suamtoriaYi(Y);
        double NsumatoriaXele2i = discret.NsumatoriaXele2i(X, data.n);
        double sumatoriaXiele2 = discret.sumatoriaXiele2(X);
        double[] predicciones = prediccion.predicciones(C);
        double[] YdeHat = resul.YdeHat(X, Y, data.n);

        System.out.println("------------- Sumatoria Multiplicación XiYi: ---------------- \n " + sumatoriaMultiplicacionXiYi);
        System.out.println("------------- Sumatoria Exponencial de X: ------------------  \n " + sumatoriaExponencialX);
        System.out.println(" ------------ N Sumatoria XiYi: ---------------------------- \n " + NSumatoriaXiYi);
        System.out.println(" ------------ Sumatoria de Xi: ----------------------------- \n " + sumatoriaXi);
        System.out.println(" ------------- Sumatoria de Yi: ---------------------------- \n " + suamtoriaYi);
        System.out.println(" ------------- N Sumatoria X^2: ---------------------------- \n " + NsumatoriaXele2i);
        System.out.println(" ------------- Sumatoria Xi^2: ----------------------------- \n " + sumatoriaXiele2);
        System.out.println(" ------------- DividendoB1: ----------------------------- \n" + prediccion.dividendoB1(X, Y, data.n));
        System.out.println(" ------------- DivisorB1: ----------------------------- \n" + prediccion.divisorB1(X, Y, data.n));
        System.out.println(" ------------- Resultado B1: ----------------------------- \n" + resul.operacionB1(X,Y,data.n));
        System.out.println(" ------------- DividendoB0: ----------------------------- \n" + prediccion.dividendoB0(X,Y, data.n ));
        System.out.println(" ------------- DivisorB0: ----------------------------- \n"+ prediccion.divisorB1(X,Y,data.n));
        System.out.println(" ------------- Resultado B0: ----------------------------- \n" + resul.operacionB0(X,Y,data.n));
        System.out.println(" ------------- Resultados de Y de Hat: -----------------------------");

        for (int i = 0; i < YdeHat.length; i++) {
            System.out.printf("Y de hat para X = %.2f: %.2f%n", X[i], YdeHat[i]);
        }

        System.out.println("---------------- Predicciones ----------------");
        for (int i = 0; i < C.length; i++) {
            System.out.printf("Predicción para x1 = %.2f: y = %.2f%n", C[i], predicciones[i]);
        }

        //doDelete(); para matar el agente

    }
}
