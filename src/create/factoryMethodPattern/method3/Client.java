package create.factoryMethodPattern.method3;

import create.factoryMethodPattern.method3.Reader.ImageReader;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * 设计模式 - 工厂方法（变种二）
 *
 * 意图：    创建一个单一的工厂类，用以包含某种选择逻辑，根据参数的不同选择实现不同的具体对象。
 * 使用案例：使各种格式的图片可以通过同一个方法导入
 * 备注：    获取到的产品对象的类型并不是具体的。
 */
public class Client {

    public static void main(String[] args) {
        InputStream is;
        ImageReader imageReader;
        for (int i = 0; i < 5; i++) {
            is = new ByteArrayInputStream(new byte[]{/*...*/});
            // 通过静态工厂方法构造对象
            imageReader = ImageReaderFactory.createImageReader(is);
            System.out.println(imageReader);
        }
    }

}
