public class TestScreen {
    public static void main(String[] args){
        Screen screen = new Screen();
        Command rollUpCmd = new RollUpCommand(screen);
        Command rollDownCmd = new RollDownCommand(screen);

        WallButton button1 = new WallButton(rollUpCmd);
        WallButton button2 = new WallButton(rollDownCmd);

        button1.push(); // Rolls up the screen
        button2.push(); // Rolls down the screen
    }
}