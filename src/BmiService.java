public class BmiService {
    public int calculate(double meter, int kilogram) {
        double bmi = kilogram / meter / meter;
        return (int) bmi;
    }

}
