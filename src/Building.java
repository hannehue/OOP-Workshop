import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Building extends Unit{

    private ArrayList<Sensor> sensors;
    private ArrayList<Actuator> actuators;

    public Building(String name){
        super(name);
    }

    public void addSensor(String name, double value, String type){
        if (type.equals("temp")){
            Sensor temperatureSensor;
            sensors.add(temperatureSensor = new TemperatureSensor(name, value));
        } else if (type.equals("CO2")){
            Sensor CO2Sensor;
            sensors.add(CO2Sensor = new CO2Sensor(name, value));
        } else {
            System.out.println("Invalid input, please try again");
        }
    }

    public void addActuator(String name){
       Actuator ventilatorActuator;
       actuators.add(ventilatorActuator = new VentilatorActuator(name));
    }

    public void removeSensor(UUID id){
        sensors.removeIf(Sensor -> Sensor.getId() == id);
    }
    
    public void removeActuator(UUID id){
        actuators.removeIf(Actuator -> Actuator.getId() == id);
    }



    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public ArrayList<Actuator> getActuators() {
        return actuators;
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
