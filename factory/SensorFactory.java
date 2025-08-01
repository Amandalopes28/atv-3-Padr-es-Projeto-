public class SensorFactory {
    private static SensorFactory instancia;

    private SensorFactory() {}

    public static SensorFactory getInstancia() {
        if (instancia == null) {
            instancia = new SensorFactory();
        }
        return instancia;
    }

    public Sensor criarSensor(String tipo) {
        switch (tipo.toLowerCase()) {
            case "temperatura":
                return new SensorTemperaturaAdapter(new SensorTemperatura());
            case "umidade":
                return new SensorUmidadeAdapter(new SensorUmidade());
case "luminosidade":
                return new SensorLuminosidadeAdapter(new SensorLuminosidade());
            default:
                throw new IllegalArgumentException("Tipo de sensor desconhecido: " + tipo);
        }
    }
}
