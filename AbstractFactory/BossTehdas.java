public class BossTehdas implements Vaatetehdas{
    public Farmarit luoFarmarit() {
        return new BossFarmarit();
    }

    public Tpaita luoTPaita() {
        return new BossTPaita();
    }

    public Lippis luoLippis() {
        return new BossLippis();
    }

    public Kengat luoKengat() {
        return new BossKengat();
    }
}
