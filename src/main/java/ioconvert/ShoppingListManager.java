package ioconvert;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {

    public void saveShoppingList(OutputStream os, List<String> purchaseList) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os))) {
            for(String item: purchaseList) {
                bw.write(item);
                bw.newLine();
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not write file",e);
        }
    }
    public List<String>loadShoppingList(InputStream is) {
        List<String> shoppingList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while((line = br.readLine()) != null) {
                shoppingList.add(line);
            }
            return shoppingList;
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file",e);
        }
    }
}

