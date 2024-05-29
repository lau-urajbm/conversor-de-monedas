public class RegistroMonedas {
    private double conversion_rate;
    private String base_code;
    private String target_code;
    private double conversion;
    private double cifraInicial;

    public RegistroMonedas(String base_code, String target_code) {
        this.base_code = base_code;
        this.target_code = target_code;
    }

    public double getCifraInicial() {
        return cifraInicial;
    }

    public void setCifraInicial(double cifraInicial) {
        this.cifraInicial = cifraInicial;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public double getConversion() {
        return conversion;
    }

    public void setConversion(double conversion) {
        this.conversion = conversion;
    }
}
