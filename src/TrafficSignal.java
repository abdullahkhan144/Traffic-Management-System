class TrafficSignal extends Signal {
    public TrafficSignal(String color, int duration) {
        super(color, duration);
    }

    public void activate() {
        display();
    }
}