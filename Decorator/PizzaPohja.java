public class PizzaPohja implements Pizza{
    private String kuvaus;
    private double hinta;

    public PizzaPohja() {
        this.kuvaus = "Pohja: ";
        this.hinta = 4.99;
    }
    @Override
    public String getKuvaus() {
        return kuvaus;
    }
    @Override
    public double getHinta() {
        return hinta;
    }
}
