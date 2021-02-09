package week15d02;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Quiz {

    private final List<Question> questions = new ArrayList<>();

    public List<Question> getQuestions() {
        return questions;
    }

    public void readFile(BufferedReader reader) throws IOException {
        String line;
        while((line = reader.readLine()) != null){
            String secondLine = reader.readLine();
            String[] arr = secondLine.split(" ");
            String answer = arr[0];
            int point = Integer.parseInt(arr[1]);
            String theme = arr[2];
            questions.add(new Question(line, answer, point, theme));
        }
    }

    public List<String> getQuestionsByTheme(String theme){
        List<String> results = new ArrayList<>();
        for(Question item : questions) {
            if(item.getTheme().equals(theme)){
                results.add(item.getQuestion());
            }
        }return results;
    }

    public Question randomQuestion(Random rnd){
        int index = rnd.nextInt(questions.size());
        return questions.get(index);
    }


    public Map<String,List<Question>> getAllQuestionsByTheme(){
        Map<String,List<Question>> result = new HashMap<>();

        for(Question item : questions) {
            if(!result.containsKey(item.getTheme())){
                result.put(item.getTheme(), new ArrayList<>());
            }
            result.get(item.getTheme()).add(item);

        }
        return result;
    }

    public String getTopTheme(){
        Map<String, List<Question>> toProcess = getAllQuestionsByTheme();
        String name = null;
        int count = 0;
        for (String item : toProcess.keySet()) {
            int sum = countPoints(item);
            if (sum > count) {
                count = sum;
                name = item;
            }
        }
        return name;
    }

    private int countPoints(String key) {
        Map<String, List<Question>> toProcess = getAllQuestionsByTheme();
        int sum = 0;
        for (Question q : toProcess.get(key)) {
            sum += q.getPoint();
        }
        return sum;
    }






    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/kerdesek.txt");
        try (BufferedReader reader = Files.newBufferedReader(path)) {
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file",e);
        }
    }



    }


