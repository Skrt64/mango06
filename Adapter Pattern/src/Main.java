public class Main {
    public static void main(String[] args) {
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4162026226311588");
        xpay.setCustomerName("Purachai Meksuk");
        xpay.setCardExpMonth("12");
        xpay.setCardExpYear("24");
        xpay.setCardCVVNo((short)135);
        xpay.setAmount(2565.23);
        PayD payD = new XpaytoPayDAdapter(xpay);
        testPayD(payD);
    }
    private static void testPayD(PayD payD) {
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCreditCardNo());
        System.out.println(payD.getCardExpMonthYear());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }
}