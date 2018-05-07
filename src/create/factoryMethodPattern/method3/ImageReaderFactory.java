package create.factoryMethodPattern.method3;

import create.factoryMethodPattern.method3.Reader.GIFReader;
import create.factoryMethodPattern.method3.Reader.ImageReader;
import create.factoryMethodPattern.method3.Reader.JPEGReader;
import create.factoryMethodPattern.method3.Reader.PNGReader;

import java.io.InputStream;

public class ImageReaderFactory {

    public static final int JPEG = 0;
    public static final int GIF = 1;
    public static final int PNG = 2;

    private ImageReaderFactory() {
    }

    public static ImageReader createImageReader(InputStream is) {
        ImageReader imageReader;
        switch (determineImageType(is)) {
            case JPEG:
                imageReader = new JPEGReader(is);
                break;
            case GIF:
                imageReader = new GIFReader(is);
                break;
            case PNG:
                imageReader = new PNGReader(is);
                break;
            default:
                imageReader = null;
        }
        return imageReader;
    }

    private static int determineImageType(InputStream is) {
        // ...
        // 返回值随机，仅供演示
        return is.hashCode() % 3;
    }

}
