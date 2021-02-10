package week10d01.senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HikingFile {

    public int[] getPlusElevation(InputStream inputStream) {
        List<Integer> elevations = new ArrayList<>();
        int[] upAndDown = new int[2];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] arr = line.split(", ");
                elevations.add(Integer.parseInt(arr[2]));
                upAndDown[0] = calculateUpAndDown(elevations)[0];
                upAndDown[1] = calculateUpAndDown(elevations)[1];
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return upAndDown;


    }
    private int[] calculateUpAndDown(List<Integer> elevations) {
        int up = 0;
        int down = 0;
        for (int i = 0; i < elevations.size() - 1; i++) {
            int diff = elevations.get(i + 1) - elevations.get(i);
            if (diff > 0) {
                up += diff;
            }
            if (diff < 0) {
                down += diff;
            }
        }
        int[] upAndDown = new int[] {up, Math.abs(down)};
        return upAndDown;
    }
}
