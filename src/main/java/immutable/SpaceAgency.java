package immutable;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private List<Satellite> onTheWay = new ArrayList<>();

    public void registerSatellite(Satellite satellite) {
        if (satellite == null){
            throw new NullPointerException("Parameter must not be null!");
        }
        onTheWay.add(satellite);
    }
    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
        for (Satellite item : onTheWay) {
            if (item.getRegisterIdent().equals(registerIdent)) {
                return item;
            }
        }
                throw new IllegalArgumentException("Satellite with the given registration cannot be found!" + registerIdent);
            }

        public String toString() {
        return onTheWay.toString();
        }


}
