import java.util.Collection;
import java.util.Map;

public class View {
    public View() {

    }

    public void print(Map map) {
        System.out.println(map);
    }

    public void print(Number nr) {
        System.out.println(nr);
    }

    public void print(String str) {
        System.out.println(str);
    }

    public void print(Collection<String> strings) {
        System.out.println(strings);
    }

    public void print(Map<String, Integer> map, int counter) {
        System.out.println(map);
        System.out.println(counter);
    }
}
