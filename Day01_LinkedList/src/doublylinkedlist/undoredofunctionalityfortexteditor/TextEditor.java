package doublylinkedlist.undoredofunctionalityfortexteditor;
class TextEditor {
    private TextNode current;
    private int historyLimit;
    private int historySize;

    public TextEditor(int historyLimit) {
        this.historyLimit = historyLimit;
        this.historySize = 0;
        this.current = null;
    }

    public void addState(String content) {
        TextNode newNode = new TextNode(content);
        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;
        historySize++;

        // Limit history size
        if (historySize > historyLimit) {
            TextNode temp = current;
            while (temp.prev != null && historySize > historyLimit) {
                temp = temp.prev;
                historySize--;
            }
            temp.prev = null;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.content);
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.content);
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.content);
        } else {
            System.out.println("No content available.");
        }
    }
}