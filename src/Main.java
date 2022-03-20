public class Main {
    public static void main(String[] args) {
        float ostatok = 1000000; // остаток суммы кредита
        float pc = 9.99f; // годовая процентная ставка (рассчитывается как ставка по кредиту /100 *12)
        int pp = 12; // ПП (-1) — процентные периоды до окончания срока кредита (в месяцах).
        CreditPaymentService service = new CreditPaymentService();
        System.out.println(service.calculate(ostatok, pc, pp));
        pp = 24;
        System.out.println(service.calculate(ostatok, pc, pp));
        pp = 36;
        System.out.println(service.calculate(ostatok, pc, pp));
    }
}
