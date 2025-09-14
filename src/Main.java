public class Main {
    public static void main(String[] args) {
        Car sportsCar = new Car.Builder()
                .setEngine("V8 Turbo")
                .setSeats(2)
                .setGPS(true)
                .setTripComputer(true)
                .build();

        Car familyCar = new Car.Builder()
                .setEngine("Hybrid")
                .setSeats(5)
                .setGPS(true)
                .setTripComputer(false)
                .build();

            System.out.println(sportsCar);
        System.out.println(familyCar);
    }
}
