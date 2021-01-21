package iofilestest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CheeseManager {

    public void saveToFile(Path path, List<Cheese> cheeses) {
        try (DataOutputStream outPutStream = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            for (Cheese item : cheeses) {
                outPutStream.writeUTF(item.getName());
                outPutStream.writeDouble(item.getLactose());
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file", e);
        }
    }


    public Cheese findCheese(Path file, String cheeseName) {
        try (DataInputStream inputStream = new DataInputStream(new BufferedInputStream(Files.newInputStream(file))) ){
            while (inputStream.available() > 0) {
                String oneName = inputStream.readUTF();
                double level= inputStream.readDouble();
                if (cheeseName.equals(oneName)) {
                    return new Cheese(oneName,level);
                }
            }
            return null;

        } catch (IOException e) {
            throw new IllegalStateException("Can't read from file!", e);
        }
    }
}