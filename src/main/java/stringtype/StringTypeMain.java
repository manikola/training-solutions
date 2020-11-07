package stringtype;


public class StringTypeMain {

    public static void main(String[] args) {

        String prefix = "Hello ";
        String name = "John Doe";

        String message = prefix + name;
        System.out.println(message);   //csak ellenőriztem

        String message2 = prefix + name + 444;
        System.out.println(message2);
        boolean b = (message.equals("Hello John Doe"));
        System.out.println(b);

        boolean c = (message.equals("Hello John Doe444"));
        System.out.println(c);

        String d = "" + "";
        System.out.println(d.length());

        String e = "Abcde";
        System.out.println(e.length());
        System.out.println(e.substring(0,2));
        System.out.println(e.substring(0,3));






    }




}
