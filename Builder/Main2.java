public class Main2 {
    public static void main(String[] args) {
        Chef chef = new Chef();
        
        BurgerBuilder burgerBuilder = new HesburgerBuilder();
        chef.setBurgerBuilder(burgerBuilder);
        chef.makeBurger();
        HesburgerBurger hesburgerBurger = (HesburgerBurger) burgerBuilder.getBurger();
        System.out.println(hesburgerBurger);

        BurgerBuilder burgerBuilder2 = new McdonaldsBuilder();
        chef.setBurgerBuilder(burgerBuilder2);
        chef.makeBurger();
        McDonaldsBurger mcDonaldsBurger = (McDonaldsBurger) burgerBuilder2.getBurger();
        System.out.println(mcDonaldsBurger);
    }

}