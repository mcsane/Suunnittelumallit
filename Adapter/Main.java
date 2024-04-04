public class Main {
    public static void main(String[] args) {
        // Normaali käyttö normaalin toteutuksen avulla
        UusiRajapinta normiToteutus = new NormiToteutus();
        normiToteutus.teeJotain();

        // Käyttö adapterin avulla olemassa olevan luokan kanssa
        VanhaLuokka vanhaLuokka = new VanhaLuokka();
        UusiRajapinta adapteriToteutus = new AdapteriToteutus(vanhaLuokka);
        adapteriToteutus.teeJotain();
    }
}