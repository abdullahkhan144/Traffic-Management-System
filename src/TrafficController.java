class TrafficController {
    private TrafficSignal red;
    private TrafficSignal yellow;
    private TrafficSignal green;

    public TrafficController(TrafficSignal red, TrafficSignal yellow, TrafficSignal green) {
        this.red = red;
        this.yellow = yellow;
        this.green = green;
    }

    public void startControlCycle() {
        while (true) {
            runSignal(green);
            runSignal(yellow);
            runSignal(red);
        }
    }

    private void runSignal(TrafficSignal signal) {
        TrafficSignalThread thread = new TrafficSignalThread(signal);
        thread.start();
        try {
            thread.join(); // Wait for thread to finish before next
        } catch (InterruptedException e) {
            System.out.println("Signal cycle interrupted.");
        }
    }
}