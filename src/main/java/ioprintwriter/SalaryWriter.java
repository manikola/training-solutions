package ioprintwriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SalaryWriter {

    private List<String> names = new ArrayList<>();

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public void writeNamesAndSalaries(Path file) {
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(file))) {
            for (String item : names) {
                pw.print(item);
                pw.print(": ");
                pw.println(salaryCounter(item));

            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file", e);
        }
    }


    private int salaryCounter(String name) {
        if (name.substring(0, 2).toLowerCase().equals("dr")) {
            return 500_000;
        }
        if (name.substring(0, 2).toLowerCase().equals("mr")) {
            return 200_000;

        } else {
            return 100_000;
        }
    }
}

