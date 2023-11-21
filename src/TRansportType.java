public enum TRansportType {
    CAR {
        @Override
        public double calculateTravelCost(double distance) {
            double a = distance*0.1;
            return a;
        }
    },
    BUS {
        @Override
        public double calculateTravelCost(double distance) {
            return distance*0.05;
        }
    },
    TRUCK {
        @Override
        public double calculateTravelCost(double distance) {
            return distance*0.02;
        }
    };
    public abstract double calculateTravelCost(double distance);
}
