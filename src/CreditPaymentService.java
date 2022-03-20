public class CreditPaymentService {
    //входные параметры: остаток кредита, годовая прооцентная ставка, оставшийся срок кредита
    public int calculate(float ostatok, float percent, int monthes) {
        float ps = percent / (100 * 12); // процентная ставка на 1 месяц
        return (int) (ostatok * (ps / (1 - Math.pow(1 + ps, -monthes))));
    }
}
