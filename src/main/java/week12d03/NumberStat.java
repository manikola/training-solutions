package week12d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class NumberStat {

    private List<Integer> numbers = new ArrayList<>();

    public List<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }

    public void readFromFile(String fileName) {
        Path file = Path.of("src/main/resources/" + fileName);

        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                addNumbers(temp);
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }

    private void addNumbers(String[] temp) {
        for (String item : temp) {
            numbers.add(Integer.parseInt(item));
        }
    }


    public int occurredOnce() {
        if (numbers.size() == 0) {
            throw new IllegalStateException("Empty list");
        }
        if (numbers.size() == 1) {
            return numbers.get(0);
        }

        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);
        if (numbers.get(0) != numbers.get(1)) {
            return numbers.get(0);
        }

        for (int i = 1; i < sortedNumbers.size() - 1; i++) {

            if (sortedNumbers.get(i) != sortedNumbers.get(i - 1) && sortedNumbers.get(i) != sortedNumbers.get(i + 1)) {
                return sortedNumbers.get(i);
            }
        }
        if (numbers.get(numbers.size() - 1) != numbers.get(numbers.size() - 2)) {
            return sortedNumbers.get(numbers.size() - 1);
        }
        throw new IllegalStateException("No unique number");

    }

    public static void main(String[] args) {
        NumberStat ns = new NumberStat();
        ns.readFromFile("numberstat.txt");
        System.out.println(ns.getNumbers().toString());
        System.out.println(ns.occurredOnce());


    }
}
