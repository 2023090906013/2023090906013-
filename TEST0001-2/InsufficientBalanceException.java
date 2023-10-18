public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
    }

    public InsufficientBalanceException(String AccountNumber,double Balance) {
        super("对不起，您的账户"+AccountNumber+"无法提取出"+Balance+"元。");
    }
}
