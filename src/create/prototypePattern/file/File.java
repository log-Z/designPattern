package create.prototypePattern.file;

/// 浅复制（相对危险，快）
// Object.clone() 需要实现 Cloneable 接口后才可用
public abstract class File implements Cloneable {

    public String name;
    public byte[] data;

    public File(String name, byte[] data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

/// 深复制（安全，慢）
/*
import java.io.*;

// Object.clone() 需要实现 Cloneable 接口后才可用
// 可序列化对象的类需要实现 Serializable 接口。深复制：先使对象序列化，再反序列化成新对象。
public abstract class Sum implements Cloneable, Serializable {

    @Override
    public Object clone() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try(ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            oos.close();
            ois.close();
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
*/
