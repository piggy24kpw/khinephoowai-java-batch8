class Vehicle{
    String country;
    int year;
    public Vehicle(String country, int year){
        this.country = country;
        this.year = year;
    }
    void startEngine(){
        System.out.println("Now, engine start");
    }
    void drive(){
        System.out.println("Your vehicle is driving");
    }
    void fuelLevel(){
        System.out.println("Your vehicle fuel level is medium.");
    }
    void vehicleType(){

    }
    void refuel(){
        System.out.println("Yor vehicle of fuel is low.Please refill!");
    }
    public  void getVehicleType(){
        System.out.println("Your Vehicle Type.");
    }
}

//Subclass:Car
class Car extends Vehicle{
    public Car(String country, int year){
        super(country,year);
    }
    void startEngine(){
        System.out.println("Your car starts engine.");
    }
    void drive(){
        System.out.println("Your car is driving");
    }
    public  void getVehicleType(){
        System.out.println("Vehicle Type is car.");
    }
}

//Subclass:
class Motorcycle extends Vehicle{
    public Motorcycle(String country, int year){
        super(country,year);
    }
    void startEngine(){
        System.out.println("Your cycle starts engine.");
    }
    void drive(){
        System.out.println("Your cycle is driving.");
    }
    public  void getVehicleType(){
        System.out.println("Your Vehicle Type is cycle");
    }
}

public class Vehicle_4_3 {
    static class FleetManager{
        public static void main(String[] args) {
            Vehicle[] myVehicleList = new Vehicle[5];

            myVehicleList[0] = new Car("Japan",2020);
            myVehicleList[1] = new Motorcycle("Singapore",2023);
            myVehicleList[2] = new Motorcycle("Thailand",2012);
            myVehicleList[3] = new Car("China",2025);
            myVehicleList[4] = new Motorcycle("US",2019);

            for(Vehicle v : myVehicleList){
                v.startEngine();
                v.drive();
                v.getVehicleType();
            }

            /*Vehicle myVehicle = new Vehicle("US",2024);
            Car myCar = new Car("Japan", 2021);
            Motorcycle myCycle = new Motorcycle("Thailand",2003);

            myVehicle.getVehicleType();
            myCar.getVehicleType();
            myCycle.getVehicleType();*/

        }
    }
}
