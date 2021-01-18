package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {

    Path pathString = Path.of("temperatures2019.dat");

    public Temperatures readTemperatures(String pathString) {
        try {
            byte[] data = Files.readAllBytes(Path.of(pathString));
            return (new Temperatures(data));


        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);

        }
    }
}
