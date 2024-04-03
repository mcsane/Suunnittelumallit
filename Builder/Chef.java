public class Chef {
    private BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder bb) {
        burgerBuilder = bb;
    }

    public void makeBurger() {
        burgerBuilder.buildBun();
        burgerBuilder.buildPatty();
        burgerBuilder.buildCheese();
        burgerBuilder.buildSalad();
    }
}