package week07d02.senior;

public interface User {

    String getUsername();
    String getFirstName();
    String getLastName();
    default String getFullName(){
        return getFirstName() + " " + getLastName();
    }
    static User of2(String username, String firstname, String lastname) {
        return new UserImpl(username, firstname, lastname);
    }

    public static User of(String userName,String firstName, String lastName){

        return new User() {
            @Override
            public String getUsername() {
                return userName;
            }

            @Override
            public String getFirstName() {
                return firstName;
            }

            @Override
            public String getLastName() {
                return lastName;
            }
        };
    }
}

//Készíts egy interfészt User néven. Az interfésznek legyen egy String getUsername(), egy String getFirstName(),
// egy String getLastName() és egy String getFullName() metódusa! Implementáld a User interfészt egy UserImpl
// nevű osztályban, mely konstruktor paraméterként várja az username, a firstName és a lastName paramétereket.
// A getFullName metódushoz adjunk az interfészben egy default implementációt!
//
//Bónusz feladat: Készítsünk egy statikus függvényt az User interfészben of néven, mely létrehoz egy új
// User típusú objektumot!