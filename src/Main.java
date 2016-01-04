import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static IOStream StreamIO;
    private static Parser Holo = new Parser();

    public static void main(String[] args) throws IOException {

        String patch = "data.txt";
        StreamIO = new IOStream(patch);
        String Text = StreamIO.read();
        System.out.println(Text);
        System.out.println(StreamIO.NumOfPhrases());
        Scanner in = new Scanner(System.in);
        String question = in.nextLine();
        System.out.println(Holo.DialogHolo.get(question));


    }
}
