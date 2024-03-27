public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void request() {
        state.handle();
        State nextState = state.nextState();
        if (nextState != null) {
            state = nextState;
            System.out.println("Tilan vaihto tapahtui.");
        } else {
            System.out.println("Tilan vaihtoa ei tarvittu.");
        }
    }
}