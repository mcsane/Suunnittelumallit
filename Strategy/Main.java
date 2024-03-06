import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        List<String> testList = new ArrayList<>();
        testList.add("One");
        testList.add("Two");
        testList.add("Three");
        testList.add("Four");
        testList.add("Five");

        // Using Strategy 1
        ListConvertor strategy1 = new Strategy1();
        System.out.println("Strategy 1:");
        System.out.println(strategy1.listToString(testList));

        // Using Strategy 2
        ListConvertor strategy2 = new Strategy2();
        System.out.println("Strategy 2:");
        System.out.println(strategy2.listToString(testList));

        // Using Strategy 3
        ListConvertor strategy3 = new Strategy3();
        System.out.println("Strategy 3:");
        System.out.println(strategy3.listToString(testList));
    }
}
