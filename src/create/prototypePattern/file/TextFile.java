package create.prototypePattern.file;

public class TextFile extends File {

    public TextFile(String name, String data) {
        super(name, data.getBytes());
    }

}
