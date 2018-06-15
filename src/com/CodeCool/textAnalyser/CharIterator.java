import java.util.ArrayList;
import java.util.Iterator;

public class CharIterator implements Iterator {
    private int index;
    ArrayList<String> chars = new ArrayList<>();

    CharIterator(FileContent file) {
        String content = file.getFileContent().replaceAll("[^A-Za-z]+", "");

        for (int i = 0; i < content.length(); i++) {
            chars.add(Character.toString(content.charAt(i)));
        }
    }

    @Override
    public boolean hasNext() {
        return index < chars.size();
    }

    @Override
    public String next() {
        return chars.get(this.index++);
    }

    @Override
    public void remove() {
        this.index = 0;
    }
}
