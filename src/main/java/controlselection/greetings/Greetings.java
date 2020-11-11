package controlselection.greetings;

public class Greetings {

    public static final int MINUTES = 60;


        public String greet ( int hour, int minutes){
            int inMinutes = hour * MINUTES + minutes;
            if (inMinutes <= 5 * MINUTES || inMinutes > 20 * MINUTES) {
                return "Good Night";
            } else if (inMinutes > 5 * MINUTES && inMinutes <= 9 * MINUTES) {
                return "Good Morning";
            } else if (inMinutes > 9 * MINUTES && inMinutes <= 18 * MINUTES + 30) {
                return "Hello";
            } else {
                return "Good Evening";
            }
        }

}
