import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator ();
        System.out.println (calculator.add (2,3));
        public static void main(String[] args) {
            // Here we create an instance of File for sample.txt file.
            File file = new File("sample.txt");

            try {
                // Read the entire contents of sample.txt
                String content = FileUtils.readFileToString(file, "UTF-8");
                System.out.println("File content: " + content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
