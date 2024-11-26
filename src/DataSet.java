public class DataSet {
    public double[] X;
    public double[] y;
    public int n;

    public  double[] C;//para las predicciones


    public DataSet(){
        this.X= new double[]{23,26,30,34,43,48,52,57,58 };
        this.y= new double[]{651,762,856,1063,1190,1298,1421,1440,1518};
        this.C= new double[] { 66, 70, 62, 33, 55};
        this.n = X.length;
    }

}
