public class AdidasTehdas implements Vaatetehdas{
    public Farmarit luoFarmarit() {
        return new AdidasFarmarit();
    }

    public Tpaita luoTPaita() {
        return new AdidasTPaita();
    }

    public Lippis luoLippis() {
        return new AdidasLippis();
    }

    public Kengat luoKengat() {
        return new AdidasKengat();
    }
}
