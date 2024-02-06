public class Main {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        DigitalClock dclock = new DigitalClock(timer);
        AnalogClock aClock = new AnalogClock(timer);
        
        for (int i = 0; i < 2000; i++) {
            timer.tick();
        }
    }
}
