import java.io.*;

public class NewClass {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Cristina\\OneDrive\\Desktop\\console2file.txt"))) {
            String content = null;
            while (!(content = br.readLine()).equals("exit")) {
                bufferedWriter.write(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}