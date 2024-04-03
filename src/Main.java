import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader readFile = new FileReader("file.txt");
            BufferedReader readBuff = new BufferedReader(readFile);

            int n = 0;
            String line;
            while((line = readBuff.readLine()) != null){
                n += Integer.parseInt(line);
            }
            System.out.println(n);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}