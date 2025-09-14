public class Car {
    private String engine;
    private int seats;
    private boolean gps;
    private boolean tripComputer;

    private Car(Builder builder) {
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.gps = builder.gps;
        this.tripComputer = builder.tripComputer;
    }

    @Override
    public String toString() {
        return "Car {" +
                "engine='" + engine + '\'' +
                ", seats=" + seats +
                ", gps=" + gps +
                ", tripComputer=" + tripComputer +
                '}';
    }

    public static class Builder {
        private String engine;
        private int seats;
        private boolean gps;
        private boolean tripComputer;

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder setGPS(boolean gps) {
            this.gps = gps;
            return this;
        }

        public Builder setTripComputer(boolean tripComputer) {
            this.tripComputer = tripComputer;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
