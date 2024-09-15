//первый
//public class Tasks {
//    public static double convert(double gallons) {
//        double liters = gallons * 3.78541;
//        return liters;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(convert(5));
//    }
//}
//второй
//public class Calculate {
//    public static int fitCalc(int minutes, int intensity) {
//        return minutes * intensity;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(fitCalc(15, 1));  // 15
//        System.out.println(fitCalc(24, 2));  // 48
//        System.out.println(fitCalc(41, 3));  // 123
//    }
//}
//третий
//public class Warehouse {
//    public static int containers(int boxes, int bags, int barrels) {
//        return (boxes * 20) + (bags * 50) + (barrels * 100);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(containers(3, 4, 2));  // 460
//        System.out.println(containers(5, 0, 2));  // 300
//        System.out.println(containers(4, 1, 4));  // 530
//    }
//}
//четвертый
//public class Triangles {
//    public static String triangleType(int x, int y, int z) {
//        // проверка условия существования треугольника
//        if (x + y <= z || x + z <= y || y + z <= x) {
//            return "not a triangle";
//        }
//
//        // проверка на равносторонний треугольник
//        if (x == y && y == z) {
//            return "equilateral";
//        }
//
//        // проверка на равнобедренный треугольник
//        if (x == y || x == z || y == z) {
//            return "isosceles";
//        }
//
//        // если все стороны разные
//        return "different-sided";
//    }
//
//    public static void main(String[] args) {
//        System.out.println(triangleType(5, 5, 5));  // equilateral
//        System.out.println(triangleType(5, 4, 5));  // isosceles
//        System.out.println(triangleType(3, 4, 5));  // different-sided
//        System.out.println(triangleType(5, 1, 1));  // not a triangle
//    }
//}
//пятый
//public class TernaryOperator {
//    public static int ternaryEvaluation(int a, int b) {
//        // используем тернарный оператор для сравнения чисел
//        return a > b ? a : b;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(ternaryEvaluation(8, 4));   // 8
//        System.out.println(ternaryEvaluation(1, 11));  // 11
//        System.out.println(ternaryEvaluation(5, 9));   // 9
//    }
//}
//шестой
//public class FabricCalculate {
//    public static int howManyItems(double fabricLength, double w, double h) {
//        // вычисляем общую площадь ткани в квадратных метрах
//        double fabricArea = fabricLength * 2;
//
//        // вычисляем площадь одного пододеяльника
//        double itemArea = w * h;
//
//        // возвращаем количество пододеяльников, которое можно сшить
//        return (int) (fabricArea / itemArea);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(howManyItems(22, 1.4, 2));     // 3
//        System.out.println(howManyItems(45, 1.8, 1.9));   // 6
//        System.out.println(howManyItems(100, 2, 2));      // 12
//    }
//}
//седьмой
//public class Factorial {
//    public static int factorial(int n) {
//        int result = 1;
//
//        // цикл для вычисления факториала
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(factorial(3));  // 6
//        System.out.println(factorial(5));  // 120
//        System.out.println(factorial(7));  // 5040
//    }
//}
//восьмой
//public class Calculator {
//    public static int gcd(int a, int b) {
//        // алгоритм Евклида для нахождения НОД
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(gcd(48, 18));   // 6
//        System.out.println(gcd(52, 8));    // 4
//        System.out.println(gcd(259, 28));  // 1
//    }
//}
//девятый
//public class Tickets {
//    public static int ticketSaler(int numberOfTickets, int ticketPrice) {
//        // рассчитываем общую выручку от продажи билетов
//        // фиксированная комиссия в нашем случае = 10% от стоимости билета (это пример)
//        double commissionRate = 0.06; // 6% комиссии
//        double totalRevenue = numberOfTickets * ticketPrice * (1 + commissionRate);
//
//        return (int) totalRevenue;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(ticketSaler(70, 1500));  // 112000
//        System.out.println(ticketSaler(24, 950));   // 24000
//        System.out.println(ticketSaler(53, 1250));  // 82875
//    }
//}
//десятый
//public class Tables {
//    public static int tables(int students, int currentTables) {
//        // количество столов, необходимых для размещения всех студентов
//        int requiredTables = (int) Math.ceil((double) students / 2);
//
//        // определяем, сколько столов не хватает
//        int missingTables = Math.max(0, requiredTables - currentTables);
//
//        return missingTables;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(tables(5, 2));   // 1
//        System.out.println(tables(31, 20)); // 0
//        System.out.println(tables(123, 58));// 4
//    }
//}
