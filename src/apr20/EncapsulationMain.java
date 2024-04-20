package apr20;

public class EncapsulationMain {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("shilpa.txt", "Vasu.txt");
        textEditor.setReadDocument("vasu.txt");
        textEditor.getWriteDocument();
        System.out.println(textEditor);

        PragraWordEditor pragraWordEditor = new PragraWordEditor("shilpa.txt", "Vasu.txt");

        pragraWordEditor.getReadDocument();
        System.out.println(pragraWordEditor);


    }
}
