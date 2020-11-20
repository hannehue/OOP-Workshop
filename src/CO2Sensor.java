import java.util.UUID;

public class CO2Sensor extends Sensor {

    public CO2Sensor(String name, double value){
        super(name, value);
    }

    @Override
    public UUID getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getValue() {
        return super.getValue();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
