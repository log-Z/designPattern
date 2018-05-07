package structure.facadePattern;

import structure.facadePattern.parts.CPU;
import structure.facadePattern.parts.HardDrive;
import structure.facadePattern.parts.Memory;

public class Computer {

    private static final long BOOT_ADDRESS = 123;  // 没有具体作用，仅为演示
    private static final long BOOT_SECTOR = 456;  // 没有具体作用，仅为演示
    private static final int SECTOR_SIZE = 64;  // 没有具体作用，仅为演示
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private HardDrive hardDrive = new HardDrive();

    public void startComputer() {
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }

}
