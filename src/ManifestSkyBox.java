public class ManifestSkyBox {
    private static final int MAX_SEATS = 12; //Maximum seats in the airplane
    private Passenger[] seats;

    public ManifestSkyBox() {
        seats = new Passenger[MAX_SEATS];
    }

    public void insertPassenger(String name, int age) {
        for (int i = 0; i < MAX_SEATS; i++) {
            if (seats[i] == null) {
                seats [i] = new Passenger(name, age);
                System.out.println("Passenger inserted");
                    return;
            }
        }
            System.out.println("No available seats");
    }

    public void removePassenger(int seatNumber) {
        if (seatNumber < 1 || seatNumber > MAX_SEATS || seats[seatNumber - 1] == null) {
            System.out.println("No passenger found at seat number" + seatNumber);
            return;
        }
        seats[seatNumber -1] = null;
        System.out.println("Passenger removed from seat number" + seatNumber);
    }

    public void switchSeats(int seatNumber1, int seatNumber2) {
        if (seatNumber1 < 1 || seatNumber1 > MAX_SEATS || seatNumber2 < 1 || seatNumber2 > MAX_SEATS) {
            System.out.println("Invalid seat numbers.");
            return;
        }
        Passenger temp = seats[seatNumber1 -1];
        seats[seatNumber1 -1] = seats[seatNumber2 -1];
        seats[seatNumber2 -1] = temp;
        System.out.println("Passengers switched seats " + seatNumber1 + " and " + seatNumber2);
    }

    public void renamePassenger(int seatNumber, String newName) {
        if (seatNumber < 1 || seatNumber > MAX_SEATS || seats[seatNumber - 1] == null) {
            System.out.println("No passenger found at seat number" + seatNumber);
            return;
        }
        seats[seatNumber - 1].setName(newName);
        System.out.println("Passenger's name updated at seat number" + seatNumber);
    }

    public void countPassengers() {
        int count = 0;
        for (Passenger seat : seats) {
            if (seat != null) {
                count++;
            }
        }
        System.out.println("Current number of passengers: " + count);
    }
    
    public void printPassengerManifest() {
        System.out.println("##### PASSENGER MANIFEST #####\n");
        System.out.println("SkyBox Ltd.\n");
        System.out.println("Seat\tName\tAge\n");
        for (int i = 0; i < MAX_SEATS; i++) {
            if (seats[i] != null) {
                System.out.println((i + 1) + "\t" + seats[i]);
            } else {
                System.out.println((i + 1) + " ");
            }
        } 
        System.out.println("##### ##### ##### ##### ##### ###");  
        }
}