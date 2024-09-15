public class Triangles {
    public static String triangleType(int x, int y, int z) {
        // Проверка условия существования треугольника
        if (x + y <= z || x + z <= y || y + z <= x) {
            return "not a triangle";
        }

        // Проверка на равносторонний треугольник
        if (x == y && y == z) {
            return "equilateral";
        }

        // Проверка на равнобедренный треугольник
        if (x == y || x == z || y == z) {
            return "isosceles";
        }

        // Если все стороны разные
        return "different-sided";
    }

    public static void main(String[] args) {
        System.out.println(triangleType(5, 5, 5));  // equilateral
        System.out.println(triangleType(5, 4, 5));  // isosceles
        System.out.println(triangleType(3, 4, 5));  // different-sided
        System.out.println(triangleType(5, 1, 1));  // not a triangle
    }
}

