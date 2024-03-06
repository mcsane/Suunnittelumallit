public class Main {
    public static void main(String[] args) {
        Kasittelija lahiEsimies = new LahiEsimies();
        Kasittelija paalikko = new Paalikko();
        Kasittelija toimitusjohtaja = new Toimitusjohtaja();
        lahiEsimies.asetaSeuraava(paalikko);
        paalikko.asetaSeuraava(toimitusjohtaja);
        lahiEsimies.kasittele(new PalkankorotusPyynto(1.0));
        lahiEsimies.kasittele(new PalkankorotusPyynto(3.0));
        lahiEsimies.kasittele(new PalkankorotusPyynto(6.0));
        lahiEsimies.kasittele(new PalkankorotusPyynto(10.0));
    }

}
