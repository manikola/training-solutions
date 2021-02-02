//package week07d04.senior;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ShoppingList {
//
//    private List<String> shoppingList = new ArrayList<>();
//
//    public long calculateSum(String fileName) {
//        Path file = Path.of("src/main/resources/" + fileName);
//
//        try (BufferedReader reader = Files.newBufferedReader(file)) {
//            String line;
//            long sum = 0;
//            while ((line = reader.readLine()) != null) {
//                shoppingList.add(line);
//            }
//                for (String item : shoppingList) {
//                    String[] arr = line.split(";");
//                    int amount = Integer.parseInt(arr[1]);
//                    int price = Integer.parseInt(arr[2]);
//                    sum = (long) (sum + (amount * price));
//                }return sum;
//
//            } catch(IOException e){
//                throw new IllegalStateException("Can not read file", e);
//            }
//
//        }
//
//
//        public static void main(String[] args) {
//        ShoppingList sl = new ShoppingList();
//        System.out.println(sl.calculateSum("shopping_list.txt"));
//        System.out.println(sl.calculateSum("shopping_list.txt"));
//    }
//}
//A ShoppingList osztályba írj egy long calculateSum(String path) metódust, mely a paraméterként átadott fájlból
// beolvassa a bevásárlólista tartalmát, és összegzi az árat! A fájl a következő formátumú sorokat tartalmazza:
// kenyér;2;30
// ahol az első a termék neve, a második a darabszám, a harmadik az egységár.
// Azaz ezen sor esetén 2 * 30 = 60 értékkel kell számolni.