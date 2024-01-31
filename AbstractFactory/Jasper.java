public class Jasper {
    private Farmarit farmarit;
    private Tpaita tPaita;
    private Lippis lippis;
    private Kengat kengat;

    public Jasper(Vaatetehdas tehdas) {
        farmarit = tehdas.luoFarmarit();
        tPaita = tehdas.luoTPaita();
        lippis = tehdas.luoLippis();
        kengat = tehdas.luoKengat();
    }

    public void pueVaatteet() {
        System.out.println("Jasper pukeutuu:");
        System.out.println(farmarit);
        System.out.println(tPaita);
        System.out.println(lippis);
        System.out.println(kengat);
    }
}

