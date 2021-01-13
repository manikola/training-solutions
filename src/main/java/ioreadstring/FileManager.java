package ioreadstring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path myFile;
    private List<Human> humans = new ArrayList<>();

    public FileManager(String  fileRelativePath) {
        this.myFile = Path.of(fileRelativePath);
    }

    public Path getMyFile() {
        return myFile;
    }

    public List<Human> getHumans() {
        return humans;
    }
    public void readFromFile(){
        try {
            List<String> fileInString = Files.readAllLines(myFile);
            for(String item : fileInString) {
                String firstAndLast[] = item.split(" ");
                Human h = new Human(firstAndLast[0], firstAndLast[1]);
                humans.add(h);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't reach file!", e);
        }
    }
}
