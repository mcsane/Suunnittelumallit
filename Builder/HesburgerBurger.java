import java.util.ArrayList;

public class HesburgerBurger {
    private ArrayList<String> parts;

    public HesburgerBurger() {
        parts = new ArrayList<>();
    }

    public void addPart(String part) {
        parts.add(part);
    }

    public ArrayList<String> getParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "HesburgerBurger{" +
                "parts=" + parts +
                '}';
    }
}