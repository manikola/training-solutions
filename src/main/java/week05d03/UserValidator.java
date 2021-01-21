package week05d03;

import java.util.List;

public class UserValidator {

    public boolean validate(List<User> users) {
        if( users == null) {
            throw new IllegalArgumentException("List can not be empty");
        }
        for (User item : users) {
            if (item == null) {
                throw new IllegalArgumentException("User can not be empty");
            }
            if ( item.getName() == null || item.getName().trim().equals("")) {
                throw new IllegalArgumentException("Name can not be empty");
            }
            if (item.getAge() < 0 || item.getAge() > 120) {
                throw new IllegalArgumentException("Invalid age");
            }
        } return true;


    }
}
