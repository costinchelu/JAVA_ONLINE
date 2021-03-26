package state;

import java.util.logging.Level;
import java.util.logging.Logger;

// state implementation
public class SelectionTool implements Tool {

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public void mouseDown() {
        logger.log(Level.INFO, "Selection icon");
    }

    @Override
    public void mouseUp() {
        logger.log(Level.INFO, "Draw a dashed rectangle");
    }
}
