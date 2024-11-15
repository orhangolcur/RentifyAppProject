public class Home {

    //creating customers
    Offer offer = new Offer();
    RentifyApp rentfyApp = new RentifyApp();
    Client client1 = new Client("Ahmet Orhan", "Furkan", "5383666669", "44678049428");
    //creating vehicles


    public void welcome() {
        rentfyApp.listOfVehicle();

        VehicleSpec vehicle = rentfyApp.getVehicles().get(2);

        System.out.println("-------------------------------------Rentify App-------------------------------------\n");



        System.out.println("Welcome to Buy, Sell and Rent Rentify Application" );
        System.out.println("\nPlease select the operation you want to do ");

        System.out.println(
                "\n1: Buy a Vehicle" +  "\n2: Rent a Vehicle" +  "\n3: Sell a Vehicle");
        //Client's selected transaction is passed to this method
        // The purchase is selected automatically because we put the entries manually
        System.out.println("                  Vehicles you may like                  ");
        for (int i = 0; i < rentfyApp.getVehicles().size() ; i++) {
            VehicleSpec vehicle1 = rentfyApp.getVehicles().get(i);
            vehicle1.getInFo();
        } offer.actions(1, client1, vehicle);



    }


}
