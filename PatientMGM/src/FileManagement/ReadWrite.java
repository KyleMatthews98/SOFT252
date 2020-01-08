package FileManagement;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ReadWrite {



    public void openFile() {
        try {
            FileReader loginFile = new FileReader("Login.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
