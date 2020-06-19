public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float index = service.calculate(1.66F, 49.5F);
        System.out.println(index);
    }
}
