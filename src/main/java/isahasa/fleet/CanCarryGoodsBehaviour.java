package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods {

    private int cargoWeight;
    private final int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        int remains = 0;
        if (cargoWeight <= maxCargoWeight) {
            this.cargoWeight = cargoWeight;
        } else {
            remains = cargoWeight - maxCargoWeight;
            this.cargoWeight = maxCargoWeight;
        }
        return remains;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }
}
