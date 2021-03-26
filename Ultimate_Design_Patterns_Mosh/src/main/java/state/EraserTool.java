package state;

import java.util.logging.Level;
import java.util.logging.Logger;

// state implementation
public class EraserTool implements Tool {

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public void mouseDown() {
        logger.log(Level.INFO, "Eraser icon");
    }

    @Override
    public void mouseUp() {
        logger.log(Level.INFO, "Clear content");

    }
}
