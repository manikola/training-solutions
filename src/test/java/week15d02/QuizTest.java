package week15d02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuizTest {

    Quiz quiz = new Quiz();

    @BeforeEach
    void setUp() {
        Path path = Path.of("src/main/resources/kerdesek.txt");
        try {
            quiz.readFile(Files.newBufferedReader(path));
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file",e);
        }
    }

    @Test
    void readFile() {
        assertEquals(57,quiz.getQuestions().size());
    }

    @Test
    void getQuestionsByThemeTest() {
        List<String> result = quiz.getQuestionsByTheme("matematika");
        assertEquals(21,result.size());
    }

    @Test
    void randomQuestion() {
        String randomQuestion = "Hany lakosa volt Magyarorszag legkisebb telepulesenek, Iborfianak, 2012 januar 1-en? 9 3 foldrajz";
        assertEquals(randomQuestion,quiz.randomQuestion(new Random(5)).toString());
    }

    @Test
    void getAllQuestionsByThemeTest() {
        Map<String, List<Question>> result = quiz.getAllQuestionsByTheme();
        assertEquals(21,result.get("matematika").size());
        assertEquals(5,result.keySet().size());
    }

    @Test
    void getTopThemeTest() {
        assertEquals("matematika", quiz.getTopTheme());
    }




}
