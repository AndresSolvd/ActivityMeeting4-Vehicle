public class Bus extends Assembly implements Vehicle {

    public Bus() {
        numOfWheels = 4;
        passengerCapacity = 20;
        weight = 200;
        int randomVin = rand.nextInt(50);
        vin = Integer.toString(randomVin);
    }

    @Override
    public void drive() {
        System.out.println("Grrrrrooooom!");
    }

    @Override
    public void start() {
        System.out.println("BRRRRRRRR");

    }

    @Override
    public void breakDown() {
        System.out.println("Hey, why did my bus stop");
    }

    @Override
    public String toString() {
        return name;
    }
}
