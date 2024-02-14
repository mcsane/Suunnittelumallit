public interface PokemonState {
    void iske();
}


class CharmanderState implements PokemonState {

    @Override
    public void iske() {
        System.out.println("Charmander hyppyisku");
    }
}

class CharmeleonState implements PokemonState {

    @Override
    public void iske() {
        System.out.println("Charmeleon kierimisisku");
    }
}
class CharizardState implements PokemonState {

    @Override
    public void iske() {
        System.out.println("Charizard megapallo");
    }
}
