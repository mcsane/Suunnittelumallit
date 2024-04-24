public class ComputerFacade {
    private static final long kBootAddress = 12345;
    private static final long kBootSector = 0;
    private static final int kSectorSize = 512;

    private CPU cpu_;
    private Memory memory_;
    private HardDrive hard_drive_;

    public ComputerFacade() {
        cpu_ = new CPU();
        memory_ = new Memory();
        hard_drive_ = new HardDrive();
    }

    public void start() {
        char[] bootData = hard_drive_.read(kBootSector, kSectorSize);
        memory_.load(kBootAddress, bootData);
        cpu_.jump(kBootAddress);
        cpu_.execute();
    }

    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}