

class CreditCard extends Payment {
    String name;
    String surname;
    String exp_date;
    String credit_card_number;

    CreditCard(double Value, String name, String surname, String exp_date, String credit_card_number) {
        super(Value);
        this.name = name;
        this.surname = surname;
        this.exp_date = exp_date;
        this.credit_card_number = credit_card_number;
    }

    public void paymentDetails() {
        System.out.println("                      PAYMENT WITH CREDIT CARD                      ");
        StringBuilder builder= new StringBuilder(this.credit_card_number);
        builder.replace(15,builder.length(),"****");
        System.out.println( "The payment of Amount: "+ this.amount+"$ "
                + "\nby the card          : " + builder
                + "\nwith the expiry date : " + this.exp_date
                + "\nby the card holder   : " + this.name + " "+this.surname
                + "\n "+this.amount+"$"+" succesfully collected.");
        System.out.println("///////////////////////////////////////////////////////////////////");
    }
}
