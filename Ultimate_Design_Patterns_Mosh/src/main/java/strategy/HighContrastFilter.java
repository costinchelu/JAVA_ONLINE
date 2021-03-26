package strategy;

// CONCRETE STRATEGY

public class HighContrastFilter implements Filter {
    @Override
    public void applyFilter(String filename) {
        System.out.println("Applying high contrast filter");
    }
}
