public class McdonaldsBuilder implements BurgerBuilder{
    private McDonaldsBurger burger;

    public McdonaldsBuilder() {
        this.burger = new McDonaldsBurger();
    }

    @Override
    public void buildBun() {
        burger.addPart("McDonalds bun");
    }

    @Override
    public void buildPatty() {
        burger.addPart("McDonalds patty");
    }

    @Override
    public void buildCheese() {
        burger.addPart("McDonalds cheese");
    }

    @Override
    public void buildSalad() {
        burger.addPart("McDonalds salad");
    }

    public McDonaldsBurger getBurger() {
        return burger;
    }
    
}
