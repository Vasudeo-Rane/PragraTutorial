package apr20;

public class PragraWordEditor {
    private String readDocument;
    private String writeDocument;

    public PragraWordEditor(String readDocument, String writeDocument) {
        this.readDocument = readDocument;
        this.writeDocument = writeDocument;
    }

    public String getReadDocument() {
        return readDocument;
    }


    public String getWriteDocument() {
        return writeDocument;
    }

    @Override
    public String toString() {
        return "PragraWordEditor{" +
                "readDocument=" + readDocument +
                ", writeDocument=" + writeDocument +
                '}';
    }
}
