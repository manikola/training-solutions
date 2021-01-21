package week12d04;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Secret {

    public static void main(String[] args) {

        Path path = Path.of("src/main/resources/secret.dat");
        try {
            byte[] bytes = Files.readAllBytes(path);
           System.out.println(bytes.length);
            for (int i = 0; i < bytes.length; i++){
            bytes[i] = (byte) (bytes[i] + 10);
                System.out.print((char) bytes[i]);



            }

        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file",e);
        }

    }
}
