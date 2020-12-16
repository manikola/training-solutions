package isahasa.fleet;

public class FerryBoat implements CanCarryGoods, CanCarryPassengers, Ship {

    private final CanCarryGoods goods;
    private final CanCarryPassengers passnr;

    public FerryBoat(int maxCargoWeight, int maxPassengers) {
        goods = new CanCarryGoodsBehaviour(maxCargoWeight);
        passnr = new CanCarryPassengersBehaviour(maxPassengers);
    }

    @Override
    public int loadCargo(int cargoWeight){
        return goods.loadCargo(cargoWeight);
    }

    public int getCargoWeight() {
        return goods.getCargoWeight();
    }

    public int getPassengers() {
        return passnr.getPassengers();
    }

    @Override
    public int loadPassenger(int passengers){
        return passnr.loadPassenger(passengers);
    }

}


