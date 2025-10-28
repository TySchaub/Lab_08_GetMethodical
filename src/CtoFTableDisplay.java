public class CtoFTableDisplay {
    public static void main(String[] args) {


        System.out.printf("%7s | %10s%n", "Celsius", "Fahrenheit");

        for (int i = -100; i <= 100; i++) {
            System.out.printf("%7d | %10.2f%n", i, CtoF(i));
        }
    }

    public static double CtoF(double Celsius) {
        double retVal = (Celsius * 1.8) + 32;
        return retVal;
    }
}
