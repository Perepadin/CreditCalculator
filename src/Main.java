public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long creditPayment1 = service.calculatecreditPayment(1_000_000, 12, 9.99);
        System.out.println("Ежемесячный платеж за кредит на 1 год:");
        System.out.println(creditPayment1);

        long creditPayment2 = service.calculatecreditPayment(1_000_000, 24, 9.99);
        System.out.println("Ежемесячный платеж за кредит на 2 года:");
        System.out.println(creditPayment2);

        long creditPayment3 = service.calculatecreditPayment(1_000_000, 36, 9.99);
        System.out.println("Ежемесячный платеж за кредит на 3 года:");
        System.out.println(creditPayment3);
    }
}