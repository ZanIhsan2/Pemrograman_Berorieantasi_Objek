package KonvertSuhu;

public class FahrenheitCelcius implements KonverterSatuan {
    private final String asal = "Fahrenheit";
    private final String tujuan = "Celcius";

    @Override
    public float konversi(float in) {
        // Rumus: C = 5/9 * (F - 32)
        return 5f / 9f * (in - 32f);
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
