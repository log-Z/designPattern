package structure.adapterPattern.objectAdapter;

/**
 * 设计模式 - 适配器（对象适配器）
 *
 * 意图：    使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 * 使用案例：现实中的各种适配器。（变体：图形界面的列表和表格等的数据模型类）
 *           src      ->  HDMI类
 *           adapter  ->  VideoAdapter类
 *           dst      ->  VGA接口
 * 备注：    使用属性来指定来源（持有）
 */
public class Client {

    public static void main(String[] args) {
        HDMI hdmi = new HDMI();
        VGA vga = new VideoAdapter(hdmi);

        // 适配前输出
        byte[] data1 = hdmi.output();
        System.out.print("适配前: ");
        for (byte b : data1) {
            System.out.print(b);
        }
        System.out.println();

        // 适配后输出
        String data2 = vga.output();
        System.out.println("适配后: " + data2);
    }

}
