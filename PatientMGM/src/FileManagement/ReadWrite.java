package FileManagement;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ReadWrite {



    protected void open() {
        try {
            FileReader loginFile = new FileReader("Login.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
