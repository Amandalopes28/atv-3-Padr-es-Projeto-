public class SensorManager {
    private Sensor sensorTemp;
    private Sensor sensorUmidade;
    private Sensor sensorLuz;
    private DisplayConsole display;


    public SensorManager() {
        SensorFactory fabrica = SensorFactory.getInstancia();


        sensorTemp = new SensorComAlerta(
                        new SensorComLog(
                            fabrica.criarSensor("temperatura")
                        ), 50);


        sensorUmidade = new SensorComLog(fabrica.criarSensor("umidade"));
        sensorLuz = fabrica.criarSensor("luminosidade");


        display = new DisplayConsole();
    }


    public void exibirDadosSensores() {
display.mostrarDados("Temperatura", sensorTemp.lerValor());
        display.mostrarDados("Umidade", sensorUmidade.lerValor());
        display.mostrarDados("Luminosidade", sensorLuz.lerValor());
    }
}



