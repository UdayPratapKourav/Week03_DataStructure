package doublylinkedlist.undoredofunctionalityfortexteditor;
class TextNode {
    String content;
    TextNode prev, next;

    public TextNode(String content) {
        this.content = content;
        this.prev = this.next = null;
    }
}