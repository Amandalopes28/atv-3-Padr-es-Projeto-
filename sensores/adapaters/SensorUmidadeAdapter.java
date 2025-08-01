public class SensorUmidadeAdapter implements Sensor {
    private SensorUmidade sensor;

    public SensorUmidadeAdapter(SensorUmidade sensor) {
        this.sensor = sensor;
    }

    public String lerValor() {
        return sensor.lerUmidade() + " %";
    }
}

