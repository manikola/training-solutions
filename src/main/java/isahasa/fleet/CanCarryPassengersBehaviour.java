package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers{

    private int passengers;
    private final int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        int loading = 0;

        if (passengers <= maxPassengers) {
            this.passengers = passengers;
        } else {
            loading = passengers - maxPassengers;
            this.passengers = maxPassengers;
        }

        return loading;
    }



    @Override
    public int getPassengers() {
        return passengers;
    }
}
