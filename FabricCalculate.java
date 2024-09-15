public class FabricCalculate {
    public static int howManyItems(double fabricLength, double w, double h) {
        // вычисляем общую площадь ткани в квадратных метрах
        double fabricArea = fabricLength * 2;

        // вычисляем площадь одного пододеяльника
        double itemArea = w * h;

        // возвращаем количество пододеяльников, которое можно сшить
        return (int) (fabricArea / itemArea);
    }

    public static void main(String[] args) {
        System.out.println(howManyItems(22, 1.4, 2));     // 3
        System.out.println(howManyItems(45, 1.8, 1.9));   // 6
        System.out.println(howManyItems(100, 2, 2));      // 12
    }
}
