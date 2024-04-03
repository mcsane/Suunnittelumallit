/**
 * BurgerBuilder
 */
public interface BurgerBuilder {
    public void buildBun();
    public void buildPatty();
    public void buildCheese();
    public void buildSalad();
    public abstract Object getBurger();
}