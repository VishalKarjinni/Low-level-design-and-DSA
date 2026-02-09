package DocumentEditor;

import DocumentEditor.model.Document;
import DocumentEditor.persistence.FileStorge;
import DocumentEditor.persistence.Persistence;

import java.io.IOException;

public class DocumentClient {
    public static void main(String[] args) throws IOException {
        Document document = new Document();
        Persistence persistence = new FileStorge();

        DocumentEditor editor = new DocumentEditor(document, persistence);

        // Simulate a client using the editor with common text formatting features.
        editor.addText("Hello, world!");
        editor.addNewLine();
        editor.addText("This is a real-world document editor example.");
        editor.addNewLine();
        editor.addText("Indented text after a tab space.");
        editor.addNewLine();
        editor.addImage("picture.jpg");

        // Render and display the final document.
        System.out.println(editor.renderDocument());

        editor.saveDocument();
    }
}
