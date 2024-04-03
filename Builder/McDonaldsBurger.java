public class McDonaldsBurger {
    private StringBuilder burger;

    public McDonaldsBurger() {
        this.burger = new StringBuilder();
    }

    public void addPart(String part) {
        burger.append(part).append("\n");
    }

    @Override
    public String toString() {
        return "McDonaldsBurger{" +
                "burger=" + burger.toString() +
                '}';
    }
}