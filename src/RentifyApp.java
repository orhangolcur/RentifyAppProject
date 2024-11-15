

import java.util.ArrayList;
import java.util.List;

public class RentifyApp {
    private List<VehicleSpec> vehicles = new ArrayList<>();

    public RentifyApp() {
    }


    public void buying(Client client, VehicleSpec vehicleSpec) {

        System.out.println("Mr./Mrs. " + client.getFirstName() + " " + client.getLastName() + " " +  "is about to buy the vehicle of your choice " + "\n ");
        vehicleSpec.getInFo();
        System.out.println("Would you like to test drive the vehicle of your choice?");


    }

    public void makePayment(String method, Client client, VehicleSpec vehicleSpec, String credit_card_number, String exp_date) {
        if (method.toLowerCase().equals("credit")) {
            CreditCard cc = new CreditCard(
                    vehicleSpec.getPrice(),
                    client.getFirstName(),
                    client.getLastName(),
                    exp_date,
                    credit_card_number);
            cc.paymentDetails();
        } else if (method.toLowerCase().equals("cash")) {
            CashPayment c = new CashPayment(100);
            c.paymentDetails();
        }
        else {
            System.out.println("Please specify your payment method by writing cash ,credit or bank transfer. ");
        }
    }

    public void makePayment(String metod, Client client, VehicleSpec vehicleSpec, String bankname , String account_number , String date){

        if (metod.toLowerCase().equals("transfer")){
            BankTransfer b = new BankTransfer(vehicleSpec.getPrice(), client.getFirstName(),client.getLastName(), bankname,account_number,date);
            b.paymentDetails();
        }
    }

    public void contract(String payment_method, Client client, VehicleSpec vehicle) {
        Contract contract = new Contract( client.getFirstName(),  client.getLastName(), client.getPhone(), client.getId(), vehicle.getVehicleType(), vehicle.getModel(), vehicle.getColour(), vehicle.getHpower(), vehicle.getPrice(), payment_method);
        contract.getContract();
    }


    public void listOfVehicle() {
        VehicleSpec vehicle = new VehicleSpec("001", "sport", "Mercedes", "Red", 1050000, 450);
        VehicleSpec vehicle2 = new VehicleSpec("003", "electric", "Tesla", "Black", 640000, 550);
        VehicleSpec vehicle3 = new VehicleSpec("002", "sport", "Bugatti", "White", 930000, 750);

        vehicles.add(0, vehicle);
        vehicles.add(1, vehicle2);
        vehicles.add(2, vehicle3);
    }


    public List<VehicleSpec> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<VehicleSpec> vehicles) {
        this.vehicles = vehicles;
    }

    public void rentVehicle() {
        System.out.println("You will get this feature very soon.");
    }

    public void sellVehicle() {
        System.out.println("You will get this feature very soon.");
    }
}
