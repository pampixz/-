public class Factorial {
    public static int factorial(int n) {
        int result = 1;

        // Цикл для вычисления факториала
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));  // 6
        System.out.println(factorial(5));  // 120
        System.out.println(factorial(7));  // 5040
    }
}
