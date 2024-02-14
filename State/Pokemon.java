public class Pokemon {
    private PokemonState state;

    public Pokemon() {
        state = new CharmanderState();
    }

    private void changeState() {
        if (state instanceof CharmanderState) {
            state = new CharmeleonState();
        } else if (state instanceof CharmeleonState) {
            state = new CharizardState();
        }
    }

    public void iske() {
        state.iske();
        changeState();
    }
}
