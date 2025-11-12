package KonvertSuhu;

public class CelciusFahrenheit implements KonverterSatuan {
    private final String asal = "Celcius";
    private final String tujuan = "Fahrenheit";

    @Override
    public float konversi(float in) {
        // Rumus: F = (9/5 * C) + 32
        return (9f / 5f * in) + 32f;
    }

    @Override
    public String satuanInput() {
        return this.asal;
    }

    @Override
    public String satuanOutput() {
        return this.tujuan;
    }
}