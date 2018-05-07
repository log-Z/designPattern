package create.factoryMethodPattern.method2;

public class Image {

    public int width;
    public int height;

    private Image(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static Image createImageByPixel(int width, int height) {
        return new Image(width, height);
    }

    public static Image createImageByPoint(int width, int height) {
        final int dpi = 300;
        return createImageByPixel(width * dpi / 72, height * dpi / 72);
    }

}
