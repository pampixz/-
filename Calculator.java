public class Calculator {
    public static int gcd(int a, int b) {
        // Алгоритм Евклида для нахождения НОД
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(48, 18));   // 6
        System.out.println(gcd(52, 8));    // 4
        System.out.println(gcd(259, 28));  // 1
    }
}
