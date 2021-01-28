package week13d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateMerger {

    private List<Employee> employees = new ArrayList<>();

    public String merge(Path file, List<Employee> employees) {

        try {
            StringBuilder employeeTable = new StringBuilder();
            String line = Files.readString(file);
            for (Employee item : employees) {
                String replaced = line.replace("{nev}", item.getName());
                replaced = replaced.replace("{ev}", Integer.toString(item.getYear()));
                employeeTable.append(replaced).append("\n");
            }
            return employeeTable.toString();


        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }


    }



    public static void main(String[] args) {
        TemplateMerger tm = new TemplateMerger();
        Path file = Path.of("src/main/resources/template.txt");
        List<Employee> emp = List.of(new Employee("John",1980),new Employee("Jack",1990),new Employee("Jane",1995));

        System.out.println(tm.merge(file,emp));

    }



    }


