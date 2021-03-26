package strategy;

public class Demo {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("A_filename", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("Another_filename", new PngCompressor(), new HighContrastFilter());
    }
}
