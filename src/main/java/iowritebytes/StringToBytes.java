package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StringToBytes {



        public void writeAsBytes(List<String> text, Path path) {
            try (BufferedOutputStream bos = new BufferedOutputStream(Files.newOutputStream(path))) {
                for(String item : text) {
                    if( !(item.substring(0,1).equals("_"))){
                        bos.write(item.getBytes());
                    }
                }


            } catch (IOException e) {
               throw new IllegalStateException("Can not write file",e);
            }
        }

}
