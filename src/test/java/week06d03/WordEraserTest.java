package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEraserTest {

    @Test
    public void testEraseWord() {
    WordEraser wordEraser = new WordEraser();

    assertEquals("A words a szavak szóközzel vannak elválasztva", wordEraser.eraseWord("A words paraméterben a szavak szóközzel vannak elválasztva","paraméterben"));
    assertEquals("ez egy próba", wordEraser.eraseWord("ez itt egy próba","itt"));
}
}
