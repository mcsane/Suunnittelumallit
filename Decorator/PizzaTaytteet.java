public abstract class PizzaTaytteet implements Pizza{
    protected Pizza pizza;

    public PizzaTaytteet(Pizza pizza) {
        this.pizza = pizza;
    }
    
}


class Juusto extends PizzaTaytteet{

    public Juusto(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getKuvaus() {
        return pizza.getKuvaus() + "juusto ";
    }

    @Override
    public double getHinta() {
        return pizza.getHinta() + 1.50;
    }

    
}
class Kinkku extends PizzaTaytteet{

    public Kinkku(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getKuvaus() {
        return pizza.getKuvaus() + "kinkku ";
    }

    @Override
    public double getHinta() {
        return pizza.getHinta() + 2.00;
    }

    
}
class Ananas extends PizzaTaytteet{

    public Ananas(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getKuvaus() {
        return pizza.getKuvaus() + "ananas ";
    }

    @Override
    public double getHinta() {
        return pizza.getHinta() + 1.00;
    }

    
}
