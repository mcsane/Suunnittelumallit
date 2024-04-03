public class Main1 {
    public static void main(String[] args) {

        Chef chef = new Chef();

        HesburgerBuilder hesburgerBuilder = new HesburgerBuilder();
        chef.setBurgerBuilder(hesburgerBuilder);
        chef.makeBurger();
        HesburgerBurger hesburgerBurger = hesburgerBuilder.getBurger();
        System.out.println(hesburgerBurger);

        McdonaldsBuilder mcDonaldsBuilder = new McdonaldsBuilder();
        chef.setBurgerBuilder(mcDonaldsBuilder);
        chef.makeBurger();
        McDonaldsBurger mcDonaldsBurger = mcDonaldsBuilder.getBurger();
        System.out.println(mcDonaldsBurger);
    }

}