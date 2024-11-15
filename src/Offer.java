
public class Offer extends RentifyApp {

    public Offer() {
    }

    public void actions(int option, Client client, VehicleSpec vehicleSpec) {
        if (option == 1 || option == 2 || option == 3) {
            switch (option) {
                case 1:
                    System.out.println("You have chosen a Tesla brand vehicle");
                    super.buying(client, vehicleSpec);
                    driveTest(vehicleSpec, "a");
                    super.makePayment("transfer", client, vehicleSpec, "1234 4567 6548 9654", "11/28");
                    super.contract("transfer", client, vehicleSpec);
                    parkingAndKeyLocation();
                    break;

                case 2:
                    System.out.println("You chose Renting a Vehicle ");
                    super.rentVehicle();
                    break;

                case 3:
                    System.out.println("You chose Selling a Vehicle ");
                    super.sellVehicle();
                    break;
            }
        } else {
            System.out.println("You entered an invalid transaction, please try again" +
                    "\n1: Buy a Vehicle" + "\n2: Rent a Vehicle" + "\n3: Sell a Vehicle");
        }
    }

    public void driveTest(VehicleSpec vehicleSpec, String respond) {
        if (respond.toLowerCase().contains("Tesla")) {
            System.out.println("You chose 'Tesla'");
            System.out.println("You are testing " + vehicleSpec.getModel());

        } else
            System.out.println("You decline to take this vehicle on a test ride");

    }

    public void parkingAndKeyLocation() {
        System.out.println("Please make sure you have the paper with the key and parking information");

        System.out.println("Thank you for choosing us");


    }
}
