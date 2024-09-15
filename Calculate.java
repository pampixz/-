public class Calculate {
    public static int fitCalc(int minutes, int intensity) {
        return minutes * intensity;
    }

    public static void main(String[] args) {
        System.out.println(fitCalc(15, 1));  // 15
        System.out.println(fitCalc(24, 2));  // 48
        System.out.println(fitCalc(41, 3));  // 123
    }
}


