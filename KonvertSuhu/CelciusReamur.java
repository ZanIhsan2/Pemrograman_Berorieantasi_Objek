package KonvertSuhu;

public class CelciusReamur implements KonverterSatuan {
    private final String asal = "Celcius";
    private final String tujuan = "Reamur";

    @Override
    public float konversi(float in) {
        // Rumus: R = 4/5 * C
        return 4f / 5f * in;
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
