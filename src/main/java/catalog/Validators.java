package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String str) {
        return str == null || str.trim().equals("");
    }

    public static boolean isEmpty(List items) {
        return items == null || items.size() == 0;

    }
}
