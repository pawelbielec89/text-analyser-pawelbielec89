
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
            }

        }
    }
}