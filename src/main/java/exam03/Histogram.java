package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Histogram {

    public String createHistogram(BufferedReader br){
        StringBuilder sb = new StringBuilder();
        String line;
        try  {
            while((line = br.readLine()) != null){
                int numberInLine = Integer.parseInt(line);
                starCreator(sb,numberInLine);

            }return sb.toString();

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file",e);
        }
    }

    public void starCreator(StringBuilder sb,int number){
        for(int i = 0; i < number; i++){
            sb.append("*");

        }sb.append("\n");

    }


    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(Histogram.class.getResourceAsStream("histogram.txt")))){
            Histogram h = new Histogram();
            System.out.println(h.createHistogram(br));

        }catch (IOException e) {
            throw new IllegalStateException("Can not find file",e);
        }
    }



}
