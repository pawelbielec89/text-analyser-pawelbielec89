
public class Application {

    public static void main(String[] args) {
        View view = new View();
        if (args.length == 0) {
            view.print("No arguments given.");
        } else {
            for(String fileName : args){
                FileContent file = new FileContent(fileName);

            }

        }
    }
}