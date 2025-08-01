public abstract class SensorDecorator implements Sensor {
    protected Sensor sensor;


    public SensorDecorator(Sensor sensor) {
        this.sensor = sensor;
    }
}
