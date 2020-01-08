package FileManagement;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {
    FileReader data;

    protected void open() {
        try {
            this.data = new FileReader("Login.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
