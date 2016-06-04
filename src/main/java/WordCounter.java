import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WordCounter {

    public static void main(String[] args) throws Exception {

        String[] words = readWordsFrom("/little-prince.txt");

        System.out.println(words.length);
    }

    public static String[] readWordsFrom(String fileName) throws Exception {
        String file = WordCounter.class.getClass().getResource(fileName).getFile();

        String contents = new String(
                Files.readAllBytes(Paths.get(new File(file).toURI())),
                StandardCharsets.UTF_8);

        return contents.split("\\s");
    }
}
