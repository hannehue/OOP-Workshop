import java.util.UUID;

public class TemperatureSensor extends Sensor {

    public TemperatureSensor(String name, double value){
        super(name, value);
    }

    @Override
    public double getValue() {
        return super.getValue();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public UUID getId() {
        return super.getId();
    }
}
