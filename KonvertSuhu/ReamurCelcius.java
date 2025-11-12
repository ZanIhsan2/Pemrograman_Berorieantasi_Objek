package KonvertSuhu;

public class ReamurCelcius implements KonverterSatuan {
    private final String asal = "Reamur";
    private final String tujuan = "Celcius";

    @Override
    public float konversi(float in) {
        // Rumus: C = 5/4 * R
        return 5f / 4f * in;
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
