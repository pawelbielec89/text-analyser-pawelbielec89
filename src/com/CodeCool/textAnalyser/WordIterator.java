import java.util.Iterator;

public class WordIterator implements Iterator {
    private String content;
    private int index;
    String[] words;

    WordIterator(FileContent file){
        content = file.getFileContent();
        words = content.split("\\W+");
    }

    @Override
    public boolean hasNext() {return index< words.length;    }

    @Override
    public Object next() {return words[index++];}
}