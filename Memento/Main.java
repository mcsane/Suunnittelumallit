public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();

        Thread arvailijaThread = new Thread(new Arvailija(arvuuttaja));
        arvailijaThread.start();
    }
}