
class CashPayment extends Payment {
    CashPayment(double val) {
        super(val);
    }

    public void paymentDetails() {
        System.out.println("                      PAYMENT WITH CASH                      ");

        System.out.println(
                "The payment of Amount: $"+ this.amount
                        + "\nHAS BEEN ISSUED SUCCESSFULLY ");
        System.out.println("///////////////////////////////////////////////////////////////");

    }
}

