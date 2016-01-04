import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStream {
    //    class on Read file
    private InputStream inputStream;
    //    class on Write file
    private OutputStream outputStream;
    //    the file path for writing and reading
    private String path;
    private int Numofphrases = 0;

    public IOStream(String path) {
        this.path = path;
    }

    public int NumOfPhrases() {
        return this.Numofphrases;

    }

    public String read() throws IOException {
        inputStream = new FileInputStream(path);
        int byteChar;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        while ((byteChar = inputStream.read()) != -1) {
            baos.write(byteChar);
            if ('|' == (char) byteChar) {
                Numofphrases++;
            }
        }
        inputStream.close();
        return baos.toString();
    }

    public void write(String st) throws IOException {
        outputStream = new FileOutputStream(path);
        outputStream.write(st.getBytes());
        outputStream.close();
    }
}
