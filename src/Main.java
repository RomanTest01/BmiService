public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;
        double height = 1.87;
        int index = service.calculate(weight, height); // должно получиться 28
        System.out.println(index);
    }
}