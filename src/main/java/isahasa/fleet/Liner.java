package isahasa.fleet;

public class Liner implements Ship, CanCarryPassengers {

    private final CanCarryPassengers passnr;

    public Liner(int maxPassengers) {
        passnr = new CanCarryPassengersBehaviour(maxPassengers);
    }

    @Override
    public int loadPassenger(int passengers) {
        return passnr.loadPassenger(passengers);
    }

    @Override
    public int getPassengers() {
        return passnr.getPassengers();
    }
}
