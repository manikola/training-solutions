package week03d04;

public class PhoneParser {

    public Phone parsePhone(String s) {
        String prefix = s.substring(0, 2);
        String number = s.substring(2);
        Phone phone = new Phone(prefix, number);
        return phone;
    }

    public static void main(String[] args) {
        PhoneParser pp = new PhoneParser();
        Phone phone = pp.parsePhone("701234567");
        System.out.println(phone.getPrefix());
        System.out.println(phone.getNumber());
        System.out.println(phone.toString());
    }


}
