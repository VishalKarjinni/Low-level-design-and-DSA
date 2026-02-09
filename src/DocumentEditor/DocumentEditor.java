package DocumentEditor;

import DocumentEditor.model.Document;
import DocumentEditor.persistence.Persistence;

import java.io.IOException;

public class DocumentEditor {
    private Document document;
    private Persistence storge;
    private String documentRender = "";

    public DocumentEditor(Document document, Persistence persistence) {
        this.document = document;
        this.storge = persistence;
    }

    public void addText(String text) {
        document.addElement(new TextElement(text));
    }

    public void addImage(String imagePath) {
        document.addElement(new ImageElement(imagePath));
    }

    public void addNewLine() {
        document.addElement(new TabSpaceElement());
    }

    public void addNewSpace() {
        document.addElement(new TabSpaceElement());
    }

    public String renderDocument() {
        if (documentRender.isEmpty()) {
            documentRender = document.render();
        }
        return documentRender;
    }

    public void saveDocument() throws IOException {
        storge.save(renderDocument());
    }
}
