package strategy;

// CONTEXT
public class ImageStorage {
    // we will need to:
    // compress image: jpg or tiff
    // filter: B&W, blur

    public void store(String filename, Compressor compressor, Filter filter) {
        compressor.compress(filename);
        filter.applyFilter(filename);
        System.out.println(filename + " created.");
    }

}
