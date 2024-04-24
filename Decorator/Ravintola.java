public class Ravintola {
    public static void main(String[] args) {
        Pizza pizza = new Ananas(new Kinkku(new Juusto(new PizzaPohja())));
        Pizza pizza2 = new Juusto(new PizzaPohja());
        Pizza pizza3 = new Kinkku(new Juusto(new PizzaPohja()));


        System.out.println("1, " + pizza.getKuvaus() + " " + pizza.getHinta());
        System.out.println("2, " + pizza2.getKuvaus() + " " + pizza2.getHinta());
        System.out.println("3, " + pizza3.getKuvaus() + " " + pizza3.getHinta());

    }
}
