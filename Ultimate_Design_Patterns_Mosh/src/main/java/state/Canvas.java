package state;


// Context
public class Canvas {

    private Tool currentTool;

    // request() methods
    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }


    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
