package create.prototypePattern;

import create.prototypePattern.file.File;
import create.prototypePattern.file.ImageFile;
import create.prototypePattern.file.TextFile;

import java.util.Arrays;

/**
 * 设计模式 - 原型
 *
 * 意图：用原型实例指定创建对象的种类，并且通过复制这些原型创建新的对象。
 * 使用案例：创建过程复杂或费时，但内部属性相等的对象的实例化。
 * 备注：复制出来的对象是不经过构造函数的。
 */
public class Client {

    public static void main(String[] args) {
        TextFile textFile = new TextFile("a.txt", "abc");
        ImageFile imageFile = new ImageFile("b.jpg", new byte[]{1, 2, 3});

        print(textFile);
        print(imageFile);
        try {
            print((File) textFile.clone());
            print((File) imageFile.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private static void print(File file) {
        System.out.println("file = " + file);
        System.out.println("name = " + file.name);
        System.out.println("data = " + Arrays.toString(file.data));
        System.out.println();
    }

}
