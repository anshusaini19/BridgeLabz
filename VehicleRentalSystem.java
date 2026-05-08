abstract class Vehicle {

    protected String vehicleNumber;
    protected String type;
    protected double rentalRate;

    private String policyNo;

    Vehicle(String vehicleNumber, String type, double rentalRate, String policyNo) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.policyNo = policyNo;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    abstract double calculateRentalCost(int days);
}

interface IInsurable {

    double calculateInsurance();

    String getInsuranceDetails();
}

class Car extends Vehicle implements IInsurable {

    Car(String vehicleNumber) {
        super(vehicleNumber, "Car", 2000, "CAR123");
    }

    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Policy No: " + getPolicyNo();
    }
}

class Bike extends Vehicle implements IInsurable {

    Bike(String vehicleNumber) {
        super(vehicleNumber, "Bike", 800, "BIKE123");
    }

    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 200;
    }

    public String getInsuranceDetails() {
        return "Policy No: " + getPolicyNo();
    }
}

class Truck extends Vehicle implements IInsurable {

    Truck(String vehicleNumber) {
        super(vehicleNumber, "Truck", 5000, "TRUCK123");
    }

    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Policy No: " + getPolicyNo();
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car("C101"),
            new Bike("B101"),
            new Truck("T101")
        };

        for (Vehicle v : vehicles) {

            IInsurable insurance = (IInsurable) v;

            System.out.println(
                "Type: " + v.type +
                ", Rent: " + v.calculateRentalCost(3) +
                ", Insurance: " + insurance.calculateInsurance() +
                ", " + insurance.getInsuranceDetails()
            );
        }
    }
}
