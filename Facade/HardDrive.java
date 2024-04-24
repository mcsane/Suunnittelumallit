public class HardDrive {
    public char[] read(long lba, int size) {
        System.out.println("Hard Drive: Reading data from LBA " + lba + " with size " + size);
        char[] data = new char[size];
        for (int i = 0; i < size; i++) {
            data[i] = (char) ('A' + i % 26);
        }
        return data;
    }
}
