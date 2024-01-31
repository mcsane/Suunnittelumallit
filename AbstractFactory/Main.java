public class Main {
    public static void main(String[] args) {
        Vaatetehdas adidasTehdas = new AdidasTehdas();
        Jasper jasper = new Jasper(adidasTehdas);
        jasper.pueVaatteet();

        Vaatetehdas bossTehdas = new BossTehdas();
        jasper = new Jasper(bossTehdas);
        jasper.pueVaatteet();
    }
}