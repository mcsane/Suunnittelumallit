public interface State {
    void handle();
    State nextState(); 
}

class NormalState implements State {
    @Override
    public void handle() {
        System.out.println("Käsitellään normaalia tilaa.");
    }

    @Override
    public State nextState() {

        return new BonusState();
    }
}

class BonusState implements State {
    @Override
    public void handle() {
        System.out.println("Käsitellään bonus tilaa.");
    }

    @Override
    public State nextState() {

        return null;
    }
}