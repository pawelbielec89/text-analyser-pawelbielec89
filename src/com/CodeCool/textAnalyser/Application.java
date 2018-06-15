
public class Application {

    public static void main(String[] args) {
        View view = new View();
        if (args.length == 0) {
            view.print("No arguments given.");
        } else {
            for (String fileName : args) {
                FileContent file = new FileContent(fileName);
                StatisticalAnalysis words = new StatisticalAnalysis(file.wordIterator());
                StatisticalAnalysis chars = new StatisticalAnalysis(file.charIterator());
                view.print(file.getFileName());
                view.print("Char count:" + chars.size());
                view.print("Word count:" + words.size());
                view.print("Dict size:" + words.dictionarySize());
                view.print("Most used words (>1%): " + words.occureMoreThan(words.size()));
                view.print("'love' count: " + words.countOf("love"));
                view.print("'hate' count: " + words.countOf("hate"));
                view.print("'music' count: " + words.countOf("music"));
                view.print("vowels %: " + chars.countVowelsPercent(chars.size()));
                view.print("'a:e count ratio' :" + chars.ratio("a", "e"));
                String alphabetLetter = "";
                StringBuilder alphabetCounts = new StringBuilder();
                for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
                    alphabetCounts.append("[ ")
                            .append(alphabet)
                            .append(" -> ")
                            .append(chars.countPercentOfLetter(String.valueOf(alphabet), chars.size()))
                            .append("] ");


                }
                System.out.println(alphabetCounts.toString());

            }

        }
    }
}