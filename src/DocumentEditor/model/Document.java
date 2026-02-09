package DocumentEditor.model;

import DocumentEditor.DocumentElement;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<DocumentElement> documentElementLists = new ArrayList<>();

    public void addElement(DocumentElement documentElement) {
        documentElementLists.add(documentElement);
    }

    public String render() {
        StringBuilder stringBuilder = new StringBuilder();
        for (DocumentElement documentElement : documentElementLists) {
            stringBuilder.append(documentElement.render());
        }
        return stringBuilder.toString();
    }

}
