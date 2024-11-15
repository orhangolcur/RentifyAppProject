

import java.time.LocalDate;

public class Contract extends Client{
    private final String seller ="Rentify App";
    private String type_of_vehicle = null;
    private String model = null;
    private String colour = null;
    private int hPower = 0;
    private double price = 0;
    private  String payment_method= null;


    public Contract(String firstName, String lastName, String phone,String id, String type_of_vehicle, String model, String colour, int hPower, double price, String payment_method) {
        super(firstName,lastName,phone,id);
        this.type_of_vehicle = type_of_vehicle;
        this.model = model;
        this.colour = colour;
        this.hPower = hPower;
        this.price = price;
        this.payment_method = payment_method;
    }


    public void getContract(){
        System.out.println("                      CONTRACT FOR SELLING A VEHİCLE                      ");

        System.out.println("BUYER");

        StringBuilder id_builder =new StringBuilder(super.getId());
        id_builder.replace(4,id_builder.length(),"*******");

        System.out.println(

                "NAME         : " + super.getFirstName() + " " + super.getLastName()
                        +"\nID Number     :" + id_builder
                        +"\nPhone Number : " + super.getPhone());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("SELLER:"
                + this.seller);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("VEHICLE DETAILS:");
        System.out.println("Upon the receipt of payment in full, the Seller agrees to transfer to the Buyer" +
                " ownership (registration\n" +
                "and/or title) of the following motor vehicle:");
        System.out.println("" + "    \nType of Vehicle               : "+ this.type_of_vehicle +
                "    \nMake and Model of Vehicle     : "+ this.model +
                "    \nColor of Vehicle              : "+ this.colour +
                "    \nThe Horse Power of The Vehicle: "+ this.hPower);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("PAYMENT INFO $"+ this.price +
                "\nPayment Method : " + this.payment_method);
        System.out.println("The Buyer will pay the Seller the purchase price in full by cash," +
                " transfer, or by Exchange with another car if agreed upon by both parties.");

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("MILEAGE:");
        LocalDate date = LocalDate.now();
        System.out.println("To the Seller's best knowledge, the current mileage is accurate and correct.\n" +
                "Odometer reading on (date of sale): " + date );



        System.out.println("----------------------------------------------------------------------------");

        System.out.println("HOLDING DEPOSIT:");
        System.out.println("The Seller acknowledges that a holding deposit of $"+price+" (amount) was received from\n" +
                "the Buyer on "+date);
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("RESPONSIBILITIES OF THE SELLER:");
        System.out.println("The seller has given all the information to the buyer.\n" +
                "It is ensured that the buyer can see the vehicle.\n" +
                "All documents of the vehicle have been sent to the buyer. \n" +
                "The Buyer acknowledges that all the above mentioned paperwork \n" +
                "and/or documentation was received from the Seller.");
        System.out.println("----------------------------------------------------------------------------");



        System.out.println("“AS IS” DISCLAIMER:");
        System.out.println("Both parties acknowledge that the above mentioned vehicle is sold as seen, that the buyer has tried and\n" +
                "inspected the vehicle to his/her satisfaction and has approved the purchase with the understanding that\n" +
                "the vehicle is sold “AS IS” without warranties or guarantees, either expressed or implied.\n" +
                "The Buyer accepts full responsibility for any repairs incurred following "+date+" (Date of sale),\n" +
                " as well as any costs related to vehicle registration, safety certification, or transfer of\n" +
                "ownership.All risks and responsibilities pass to the Buyer once payment is made in full and the Buyer takes\n" +
                "possession of the vehicle.");
        System.out.println("----------------------------------------------------------------------------");




        System.out.println("SIGNATURES:");
        System.out.println("" +
                "Buyer's Signature ___(Electronic Signature)__ Date "+date+"\n" +
                "Seller's Signature ___(Electronic Signature)__ Date "+date+"\n");

        System.out.println("//////////////////////////////////////////////////////////////");
    }
}


