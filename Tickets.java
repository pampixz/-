public class Tickets {
    public static int ticketSaler(int numberOfTickets, int ticketPrice) {
        // Рассчитываем общую выручку от продажи билетов
        // Фиксированная комиссия в нашем случае = 10% от стоимости билета (это пример)
        double commissionRate = 0.06; // 6% комиссии
        double totalRevenue = numberOfTickets * ticketPrice * (1 + commissionRate);

        return (int) totalRevenue;
    }

    public static void main(String[] args) {
        System.out.println(ticketSaler(70, 1500));  // 112000
        System.out.println(ticketSaler(24, 950));   // 24000
        System.out.println(ticketSaler(53, 1250));  // 82875
    }
}
