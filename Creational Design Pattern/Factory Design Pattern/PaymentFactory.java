public class PaymentFactory {
    public static Payment paymentGateWay(String type) {
        switch (type.toUpperCase()) {
            case "CREDITCARD":
                return new CreditCard();
            case "PAYPAL":
                return new Paypal();
            case "BANKTRANSFER":
                return new BankTransfer();
            default:
                throw new IllegalArgumentException("invalid");
        }
    }
}
