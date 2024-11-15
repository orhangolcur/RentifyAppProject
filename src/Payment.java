

class Payment {
    double amount;

    Payment(double val){
        this.amount=Math.round(val * 100)/100.0;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount= amount;
    }

    public void paymentDetails() {
        System.out.println("The payment amount is = "+this.amount);
    }
}

