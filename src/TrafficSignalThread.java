class TrafficSignalThread extends Thread {
    private TrafficSignal signal;

    public TrafficSignalThread(TrafficSignal signal) {
        this.signal = signal;
    }

    @Override
    public void run() {
        try {
            signal.activate();
            Thread.sleep(signal.duration * 1000);
            System.out.println(signal.color + " signal OFF");
        } catch (InterruptedException e) {
            System.out.println(signal.color + " signal interrupted.");
        }
    }
}
