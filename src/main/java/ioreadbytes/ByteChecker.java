package ioreadbytes;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {

    public int readBytesAndFindAs(String fileName) {
    Path file = Path.of(fileName);
    int count = 0;

    try(InputStream iS = Files.newInputStream(file))

    {
        byte[] bytes = new byte[1000];
        int size;
        while ((size = iS.read(bytes)) > 0) {
            for (byte item : bytes) {
                if (item == 97) {
                    count++;
                }
            }
        }
    } catch(
    IOException e)

    {
        throw new IllegalStateException("Can't read file", e);
    }
    return count;

}
}
