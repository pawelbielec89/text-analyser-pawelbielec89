import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StatisticalAnalysis {
    Iterator<String> iter;

    public StatisticalAnalysis(Iterator<String> iter) {
        this.iter = iter;
    }

    public int countOf(String... strings) {
        int counter = 0;
        for (String str : strings) {
            counter++;
        }
        return counter;
    }

    public int dictionarySize() {
        iter.remove();

        Set<String> words = new TreeSet<>();
        while (iter.hasNext()) {
            words.add(iter.next());
        }
        return words.size();

    }

    public int size() {
        int counter = 0;
        while (iter.hasNext()) {
            iter.next();
            counter++;
        }
        return counter;
    }
//
//    public Set<String> occureMoreThan(int counter) {
//
//    }
}
