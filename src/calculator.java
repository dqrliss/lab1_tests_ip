public class calculator {
    private double x;
    private int k;

    public calculator(double x, int k) {
        this.x = x;
        this.k = k;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public int getK() {
        return k;
    }
    public void setK(int k) {
        this.k = k;
    }
    public double calc() {
        int n = 1;
        double a = 1, e = Math.pow(10, (-1)*(k+10)), res = a, slag;
        do {
            double domnozh = (-1)*x*(n+2)/n;
            slag = a*domnozh;
            res += slag;
            a = slag;
            n++;
        }
        while (slag > e || slag < (-1)*e);
        return res;
    }
}
