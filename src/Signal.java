class Signal {
    protected String color;
    protected int duration;

    public Signal(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void display() {
        System.out.println(color + " signal ON for " + duration + " seconds");
    }
}
