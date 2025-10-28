public class CtoFTableDisplay {
    public static void main(String[] args) {

        for (int i = -100; i < 100; i++) {
            System.out.println(CtoF(i));
        }
    }

    public static double CtoF(double Celsius) {
        double retVal = (Celsius * 1.8) + 32;
        return retVal;
    }
}
