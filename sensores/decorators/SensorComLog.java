public class SensorComLog extends SensorDecorator {
    public SensorComLog(Sensor sensor) {
        super(sensor);
    }


    public String lerValor() {
        String valor = sensor.lerValor();
        System.out.println("[LOG] Sensor lido: " + valor);
        return valor;
    }
}
