package isahasa.fleet;

public class CargoShip implements Ship, CanCarryGoods {

    private final CanCarryGoods goods;

    public CargoShip(int maxCargoWeight) {
        goods = new CanCarryGoodsBehaviour(maxCargoWeight);
    }

    public int loadCargo(int cargoWeight){
        return goods.loadCargo(cargoWeight);
    }

    public int getCargoWeight() {
        return goods.getCargoWeight();
    }

}

