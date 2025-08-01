public class SensorTemperaturaAdapter implements Sensor {
    private SensorTemperatura sensor;

public SensorTemperaturaAdapter(SensorTemperatura sensor) {
        this.sensor = sensor;
    }

    public String lerValor() {
        return sensor.lerTemperatura() + " °C";
    }
}
