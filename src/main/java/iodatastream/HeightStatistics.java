package iodatastream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class HeightStatistics {

    public void saveHeights(List<Integer> heights, Path path) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(
                new BufferedOutputStream(Files.newOutputStream(path)))) {
            dataOutputStream.writeInt(heights.size());
            for(Integer item : heights){
                dataOutputStream.writeInt(item);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read File",e);
        }
    }
}
