package week15d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Quiz {

    private List<String[]> data = new ArrayList<>();

    public List<String[]> getData() {
        return data;
    }

    public void setData(List<String[]> data) {
        this.data = data;
    }

    public void readFile(BufferedReader reader) throws IOException {
        String line;

        List<String[]> data = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            String[] arr = new String[4];
            arr[0] = line;
            System.out.println(arr[0]);
            line = reader.readLine();
            String[] parts = line.split(" ");
            arr[1] = parts[0];
            arr[2] = parts[1];
            arr[3] = parts[2];
            data.add(arr);


        }

    }



//    1. Írj egy metódust, melynek paramétere a téma és add vissza, az összes kérdést abban a témában.
//    (Csak a kérdéseket), string list

    public List<String>  getQuestions(String theme){
        List<String> results = new ArrayList<>();
        for( String[] item : data){
            if( item[3].equals(theme)){
                results.add(item [0]);
            }
        }return results;
    }


    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        List<String> questions;
        Path file = Path.of("src/main/resources/kerdesek.txt");

            try (BufferedReader reader = Files.newBufferedReader(file)) {
            quiz.readFile(reader);
                System.out.println(quiz.getData().size());

               questions =  quiz.getQuestions("tortenelem");
                System.out.println(questions);




            } catch (IOException e) {
               throw new IllegalStateException("Can not read file");
            }
        }



    }


