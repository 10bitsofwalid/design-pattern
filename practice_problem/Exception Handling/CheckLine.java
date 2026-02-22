import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckLine {

    public static String readFirstLine(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String firstLine = br.readLine();
        br.close();
        return firstLine;
    }

    public static void main(String[] args) {
        try {
            String line = readFirstLine("new.txt");
            System.out.println(line + " this is the first line");
        } catch (IOException e) {
            System.out.println("invalid file");
        }
        System.out.println("system continues!");
    }
}
