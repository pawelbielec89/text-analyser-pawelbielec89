import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class FileContent implements IterableText {
    private String fileName;
    private String content;

    FileContent(String fileName) {
        this.fileName = fileName;
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                contentBuilder.append(sCurrentLine + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        content = contentBuilder.toString();
    }

    public Iterator<String> charIterator() {
        CharIterator charIter = new CharIterator(this);
        return charIter;
    }

    public Iterator<String> wordIterator() {
        WordIterator wordIter = new WordIterator(this);
        return wordIter;
    }

    String getFileName() {
        return "==" + this.fileName + "==";
    }

    String getFileContent() {
        return this.content;
    }
}

