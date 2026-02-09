package DocumentEditor.persistence;

import java.io.IOException;

public interface Persistence {
    void save(String data) throws IOException;
}
