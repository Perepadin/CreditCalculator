public class CreditPaymentService {
    public long calculatecreditPayment(long loanAmount, long loanTerm, double annualRate) {
        double monthlyRate = (annualRate / 100) / 12;
        long creditPayment = (long) (loanAmount * (monthlyRate + (monthlyRate / (Math.pow((1 + monthlyRate), loanTerm) - 1))));
        return creditPayment;
    }
}