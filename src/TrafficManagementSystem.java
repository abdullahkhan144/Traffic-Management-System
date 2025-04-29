public class TrafficManagementSystem {
    public static void main(String[] args) {
    	TrafficSignal red = new TrafficSignal("Red", 5);
        TrafficSignal yellow = new TrafficSignal("Yellow", 2);
        TrafficSignal green = new TrafficSignal("Green", 4);

        TrafficController controller = new TrafficController(red, yellow, green);
        controller.startControlCycle();
    }
}