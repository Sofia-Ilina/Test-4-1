public class Main {
    public static void main(String[] args) {
        BmiService servise = new BmiService();
        double meter = 1.74;
        int kilogram = 68;
        int index = (int) servise.calculate(1.74, 68);
        System.out.println("Индекс массы тела:" + index);

    }
}
