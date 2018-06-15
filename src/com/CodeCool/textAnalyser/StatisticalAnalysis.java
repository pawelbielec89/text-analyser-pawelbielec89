import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class StatisticalAnalysis {
    Iterator<String> iter;

    StatisticalAnalysis(Iterator<String> iter) {
        this.iter = iter;
    }

    int countOf(String str) {
        iter.remove();
        int counter = 0;
        while(iter.hasNext()){
            if(iter.next().toLowerCase().equals(str.toLowerCase())){
                counter++;
            }
        }
        return counter;
    }

    int dictionarySize() {
        iter.remove();

        Set<String> words = new TreeSet<>();
        while (iter.hasNext()) {
            words.add(iter.next().toLowerCase());
        }
        return words.size();

    }

    int size() {
        iter.remove();
        int counter = 0;
        while (iter.hasNext()) {
            iter.next();
            counter++;
        }
        return counter;
    }

    Set<String> occureMoreThan(int allText) {

        Set<String> mostUsedWords = new TreeSet<>();

        float percent = allText / 100;
        iter.remove();
        HashMap<String, Integer> wordsMap = new HashMap<>();
        while (iter.hasNext()) {
            String str = iter.next().toLowerCase();
            if (wordsMap.containsKey(str)) {
                int value = wordsMap.get(str);
                wordsMap.replace(str, ++value);
            } else {
                wordsMap.putIfAbsent(str, 1);
            }
        }
        for (HashMap.Entry<String, Integer> entry : wordsMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if (percent < value) {
                mostUsedWords.add(key);
            }
        }
        return mostUsedWords;
    }
    float countVowelsPercent(int allText){
        iter.remove();
        int counter = 0;
        while(iter.hasNext()){
            String letter = iter.next().toLowerCase();
            String vowels = "aoieu";
            int index = vowels.indexOf(letter);
            if(index != -1){
                counter++;
            }

        }
        return (float) counter/allText*100;
    }
    float ratio(String stringA, String stringB){
        return (float) countOf(stringA)/countOf(stringB);
    }
    float countPercentOfLetter(String str, int textSize){

        int letterOccour = countOf(str);
        return (float) (letterOccour*100.0/textSize);
    }
}
