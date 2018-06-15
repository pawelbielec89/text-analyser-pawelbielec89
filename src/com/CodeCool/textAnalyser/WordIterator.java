import java.util.Iterator;

public class WordIterator implements Iterator {
    private int index;
    String[] words;

    WordIterator(FileContent file){
        String content = file.getFileContent();
        content.replaceAll("\n"," ");
        words = content.split("\\W+");
    }

    @Override
    public boolean hasNext() {return index< words.length;    }

    @Override
    public String next() {return words[index++];}

    @Override
    public void remove() {
        this.index = 0;
    }
}