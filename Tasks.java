public class Tasks {
    public static double convert(double gallons) {
        double liters = gallons * 3.78541;
        return liters;
    }

    public static void main(String[] args) {
        System.out.println(convert(5));
    }
}
