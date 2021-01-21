package meetingrooms;

import java.util.Scanner;

public class Controller {

    private Office office;
    Scanner scanner = new Scanner(System.in);

    public void readOffice(){
        office = new Office();

        System.out.println("Hány tárgyalót szeretne létrehozni?");
    int db = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < db; i++) {
        System.out.println("Adja meg a(z) " + (i + 1) + ". tárgyaló nevét!");
        String name = scanner.nextLine();

        System.out.println("Adja meg a(z) " + (i + 1) + ". tárgyaló hosszúságát!");
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println("Adja meg a(z) " + (i + 1) + ". tárgyaló szélességét!");
        int width = Integer.parseInt(scanner.nextLine());

        office.addMeetingRoom(new MeetingRoom(name, length, width));
    }

}


    public void printMenu(){
        System.out.println("1. Tárgyalók sorrendben\n" +
                "2. Tárgyalók visszafele sorrendben\n" +
                "3. Minden második tárgyaló\n" +
                "4. Területek\n" +
                "5. Keresés pontos név alapján\n" +
                "6. Keresés névtöredék alapján\n" +
                "7. Keresés terület alapján");

    }
    public void runMenu() {
        System.out.println("Melyik menüpontot választja?");
        int menuItem = scanner.nextInt();
        scanner.nextLine();

        if (menuItem == 1) {
            office.printNames();
        }
        if (menuItem == 2) {
            office.printNamesReverse();
        }
        if (menuItem == 3) {
            office.printEventNames();
        }
        if (menuItem == 4) {
            office.printAreas();
        }
        if (menuItem == 5) {
            office.printMeetingRoomsWithName(scanner.nextLine());
        }
        if (menuItem == 6) {
            office.printMeetingRoomsContains(scanner.nextLine());
        }
        if (menuItem == 7) {
            System.out.println("Mekkoránál nagyobbat keresel?");
            int area = scanner.nextInt();
            scanner.nextLine();

            office.printAreasLargerThan(area);
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
            controller.readOffice();
            controller.printMenu();
            controller.runMenu();

    }

}
