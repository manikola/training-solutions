package week14d05;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordsCounterTest {

    @Test
    public void countWordsTest() {


        WordsCounter wc = new WordsCounter();
        Path path = Path.of("src/main/resources/hachiko.srt");
        Map<String, Integer> wordsSum = wc.countWords(path, "Hachiko", "haza", "pályaudvar", "jó");

        assertEquals(15, wordsSum.get("haza"));
        assertEquals(4, wordsSum.get("Hachiko"));

    }


}
