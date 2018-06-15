import java.util.ArrayList;
import java.util.Iterator;

public class CharIterator implements Iterator {
    private String content;
    private int index;
    ArrayList<String> chars = new ArrayList<>();

    CharIterator(FileContent file) {
        content = file.getFileContent();
        for (int i = 0; i < content.length(); i++) {
            chars.add(Character.toString(content.charAt(i)));
        }
    }

    @Override
    public boolean hasNext() {
        return index < chars.size();
    }

    @Override
    public Object next() {
        return chars.get(this.index++);
    }
}
