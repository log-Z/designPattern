package structure.facadePattern.parts;

public class HardDrive {

    public byte[] read(long lba, int size) {
        //...
        return new byte[size];  // 没有具体功能，仅为演示
    }

}
