public class SensorComAlerta extends SensorDecorator {
    private double limite;


    public SensorComAlerta(Sensor sensor, double limite) {
        super(sensor);
        this.limite = limite;
    }


    public String lerValor() {
        String valor = sensor.lerValor();
        try {
            double valorNumerico = Double.parseDouble(valor.split(" ")[0]);
            if (valorNumerico > limite) {
                return valor + " [ALERTA!]";
            }
        } catch (Exception e) {
            
        }
        return valor;
    }
}



