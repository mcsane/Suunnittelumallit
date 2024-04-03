class HesburgerBuilder implements BurgerBuilder {
    private HesburgerBurger burger;

    public HesburgerBuilder() {
        this.burger = new HesburgerBurger();
    }

    @Override
    public void buildBun() {
        burger.addPart("Hesburger Bun");
    }

    @Override
    public void buildPatty() {
        burger.addPart("Hesburger Patty");
    }

    @Override
    public void buildSalad() {
        burger.addPart("Hesburger Salad");
    }

    @Override
    public void buildCheese() {
        burger.addPart("Hesburger Cheese");
    }

    public HesburgerBurger getBurger() {
        return burger;
    }
}