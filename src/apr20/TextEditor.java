package apr20;

public class TextEditor {
    private String readDocument;
    private String writeDocument;

    public TextEditor(String readDocument, String writeDocument) {
        this.readDocument = readDocument;
        this.writeDocument = writeDocument;
    }

    public String getReadDocument() {
        return readDocument;
    }

    public void setReadDocument(String readDocument) {
        this.readDocument = readDocument;
    }

    public String getWriteDocument() {
        return writeDocument;
    }

    public void setWriteDocument(String writeDocument) {
        this.writeDocument = writeDocument;
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "readDocument='" + readDocument + '\'' +
                ", writeDocument='" + writeDocument + '\'' +
                '}';
    }
}
