package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println(introControl.substractTenIfGreaterThanTen(1));
        System.out.println(introControl.substractTenIfGreaterThanTen(11));
        System.out.println(introControl.substractTenIfGreaterThanTen(35));

        System.out.println(introControl.describeNumber(5));
        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(10));

        System.out.println(introControl.greetingToJoe("Jack"));
        System.out.println(introControl.greetingToJoe("joe"));
        System.out.println(introControl.greetingToJoe("Joe"));

        System.out.println(introControl.calculateBonus(1200000));
        System.out.println(introControl.calculateBonus(900000));
        System.out.println(introControl.calculateBonus(2000000));

        System.out.println(introControl.calculateConsumption(5100, 5600));
        System.out.println(introControl.calculateConsumption(500, 7654));
        System.out.println(introControl.calculateConsumption(9999, 50));

        System.out.println("printNumbers");
        introControl.printNumbers(10);

        System.out.println("printNumbersBetween");
        introControl.printNumbersBetween(25, 34);

        System.out.println("printNumbersBetweenAnyDirection");
        introControl.printNumbersBetweenAnyDirection(10, 20);
        System.out.println("printNumbersBetweenAnyDirection - reverse");
        introControl.printNumbersBetweenAnyDirection(20, 10);

        System.out.println("printOddNumbers - 1");
        introControl.printOddNumbers(1);
        System.out.println("printOddNumbers - 10");
        introControl.printOddNumbers(10);
        System.out.println("printOddNumbers - 11");
        introControl.printOddNumbers(11);

    }
}
