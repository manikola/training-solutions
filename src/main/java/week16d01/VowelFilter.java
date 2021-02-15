package week16d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class VowelFilter {

    private static final String HUNGARIAN_VOWELS = "aáeéiíoóöőuúüűAÁEÉIÍOÓÖŐUÚÜŰ";


    public String filterVowels(BufferedReader reader) {
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            while (((line = reader.readLine()) != null)) {
                processLine(sb, line);
            }
            return sb.toString();
        } catch (IOException ioe) {
            throw new IllegalStateException("Something went wrong", ioe);
        }
    }

    private void processLine(StringBuilder sb, String line) {
        for (Character c : line.toCharArray()) {
            if (!HUNGARIAN_VOWELS.contains(c.toString())) {
                sb.append(c);
            }
        }
        sb.append("\n");
    }

    public static void main(String[] args) {
        try (BufferedReader br = Files.newBufferedReader(Path.of("vowelfilter.txt"))) {
            VowelFilter c = new VowelFilter();
            System.out.println(c.filterVowels(br));

        } catch (IOException e) {
            throw new IllegalStateException("Can not find file", e);
        }
    }
}
