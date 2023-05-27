public class Truck extends Assembly implements Vehicle {

    public Truck() {
        numOfWheels = 18;
        passengerCapacity = 2;
        weight = 1000;
        int randomVin = rand.nextInt(50);
        vin = Integer.toString(randomVin);
    }

    @Override
    public void drive() {
        System.out.println("Grshoooooom");
    }

    @Override
    public void start() {
        System.out.println("BraaaahBraaahBrrrrrrraaaaahh");

    }

    @Override
    public void breakDown() {
        System.out.println("Oh no my truck! It's broken down!");
    }

    @Override
    public String toString() {
        return name;
    }
}
