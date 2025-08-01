public class SensorLuminosidadeAdapter implements Sensor {
    private SensorLuminosidade sensor;

    public SensorLuminosidadeAdapter(SensorLuminosidade sensor) {
        this.sensor = sensor;
    }

    public String lerValor() {
        return sensor.lerLuminosidade() + " lux";
    }
}
