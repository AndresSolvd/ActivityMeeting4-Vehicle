// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {

    public static void main(String[] args) {
        final int numOfVehicles = 20;
        Assembly[] inventory = new Assembly[numOfVehicles];
        for (int i = 0; i < numOfVehicles; i++) {
            if (i < 10) {
                inventory[i] = new Car();
                inventory[i].name = "Car" + Integer.toString(i);
                //inventory[i].vin = Integer.toString(i);
            } else if ((i >= 10) && (i < 15)) {
                inventory[i] = new Bus();
                inventory[i].name = "Bus" + Integer.toString(i);
                //inventory[i].vin = Integer.toString(i);
            } else {
                inventory[i] = new Truck();
                inventory[i].name = "Truck" + Integer.toString(i);
                //inventory[i].vin = Integer.toString(i);
            }
        }
        for (int j = 0; j < numOfVehicles; j++) {
            if (inventory[j].vin.equals("3")) {
                inventory[j] = null;
                break;
            }
        }
        for (Assembly e : inventory) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }
}

 /*   We have Inventory of vehicles: passenger car, bus, truck.
        Requirements:
        X 1 interface with at least 2 methods
        X 1 Abstract class
        X 1 final variable
        X Add vehicle to the inventory
        X Remove vehicle by name or VIN (id)
        X Print all items in inventory*/