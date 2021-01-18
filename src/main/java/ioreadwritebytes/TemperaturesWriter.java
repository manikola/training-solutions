package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesWriter {

    Path pathString = Path.of("temperatures2019.dat");

    public void writeTemperatures(Temperatures temperatures, String pathString) {
        try {
            Files.write(Path.of(pathString),temperatures.getData());
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file",e);
        }

    }
}
