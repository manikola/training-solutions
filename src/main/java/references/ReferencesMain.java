package references;

public class ReferencesMain {

    public static void main(String[] args) {
        Person person1 = new Person("Ancsa", 1976);
        Person person2 = person1;

        person2.setName("Oz");

        System.out.println(person1.toString());
        System.out.println(person2.toString());

        int a = 24;
        int b = a;

        b++;

        System.out.println(a);
        System.out.println(b);

        person2 = new Person("Mother", 1945);

        System.out.println(person1.toString());
        System.out.println(person2.toString());

    }

}
