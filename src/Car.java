public class Car extends Assembly implements Vehicle {

    public Car() {
        numOfWheels = 4;
        passengerCapacity = 4;
        weight = 100;
        int randomVin = rand.nextInt(50);
        vin = Integer.toString(randomVin);
    }

    @Override
    public void drive() {
        System.out.println("Zoom Zoom!");
    }

    @Override
    public void start() {
        System.out.println("VerVerVer");

    }

    @Override
    public void breakDown() {
        System.out.println("KerChunk");
    }

    @Override
    public String toString() {
        return name;
    }
}
