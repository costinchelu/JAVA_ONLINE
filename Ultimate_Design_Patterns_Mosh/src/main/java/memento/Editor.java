package memento;


// originator
public class Editor {

    private String content;

    // stores current state into a EditorState object
    public EditorState createState() {
        return new EditorState(content);
    }

    public void restoreLastState(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
