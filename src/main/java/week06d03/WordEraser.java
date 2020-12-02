package week06d03;

public class WordEraser {

    public String eraseWord(String words, String word) {
        StringBuilder builder = new StringBuilder();
        String[] arrWords = words.split(" ");
        for (int i =0; i < arrWords.length; i++) {
            if (!arrWords[i].equals(word)) {
                builder.append(arrWords[i] + " ");
            }else {
                continue;
            }

            } return builder.toString().trim();
        }


    }

