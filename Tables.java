public class Tables {
    public static int tables(int students, int currentTables) {
        // Количество столов, необходимых для размещения всех студентов
        int requiredTables = (int) Math.ceil((double) students / 2);

        // Определяем, сколько столов не хватает
        int missingTables = Math.max(0, requiredTables - currentTables);

        return missingTables;
    }

    public static void main(String[] args) {
        System.out.println(tables(5, 2));   // 1
        System.out.println(tables(31, 20)); // 0
        System.out.println(tables(123, 58));// 4
    }
}
