public class Main {
    public static void main(String[] args) {
        Context context = new Context(new NormalState());
        context.request(); 
        context.request(); 
    }
}