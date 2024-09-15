public class TernaryOperator {
    public static int ternaryEvaluation(int a, int b) {
        // Используем тернарный оператор для сравнения чисел
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(ternaryEvaluation(8, 4));   // 8
        System.out.println(ternaryEvaluation(1, 11));  // 11
        System.out.println(ternaryEvaluation(5, 9));   // 9
    }
}
