public class RollDownCommand implements Command {
    private Screen screen;

    public RollDownCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.rollDown();
    }
}