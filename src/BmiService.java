public class BmiService {
    public int calculate(double a, double b) {
        double c = a / (b * b);
        return (int) c;
    }
}