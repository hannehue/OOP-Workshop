public abstract class Actuator extends Unit {
    private boolean on;

    public Actuator(String name){
        super(name);
        this.on = false;
    }

    public boolean isOn() {
        return on;
    }
}
