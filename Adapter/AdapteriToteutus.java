public class AdapteriToteutus implements UusiRajapinta {
    private VanhaLuokka vanhaLuokka;

    public AdapteriToteutus(VanhaLuokka vanhaLuokka) {
        this.vanhaLuokka = vanhaLuokka;
    }

    @Override
    public void teeJotain() {
        vanhaLuokka.teeJotain();
    }
}