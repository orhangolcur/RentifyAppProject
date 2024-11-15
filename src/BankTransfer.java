

public class BankTransfer extends Payment{
    String name;
    String surname;
    String bankName;
    String account_number;
    String date;




    public BankTransfer(double value,String name, String surname, String bankName, String account_number, String date){
        super(value);
        this.name = name;
        this.surname= surname;
        this.bankName=bankName;
        this.account_number = account_number;
        this.date = date;



    }
    public void paymentDetails() {
        System.out.println("                      PAYMENT WITH BANK TRANSFER                     ");
        StringBuilder builder= new StringBuilder(this.account_number);
        builder.replace(15,builder.length(),"****");
        System.out.println( "The payment of Amount: "+ this.amount+"$ "
                + "\nby the person          : " + builder
                + "\nwith the sending date : " + this.date
                + "\nby the bank account holder  : " + this.name + " "+this.surname
                + "\n "+this.amount+"$"+" succesfully collected.");
        System.out.println("///////////////////////////////////////////////////////////////////");
    }




}

