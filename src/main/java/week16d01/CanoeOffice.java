package week16d01;

import java.time.LocalDateTime;
import java.util.*;

public class CanoeOffice {

    List<CanoeRental> canoeRentals= new ArrayList<>();

    public CanoeOffice(List<CanoeRental> canoeRentals) {
        this.canoeRentals = canoeRentals;
    }

    public void addRental(CanoeRental cr){
        canoeRentals.add(cr);
    }

    public CanoeRental findRentalByName(String name) {
        CanoeRental result = null;
        for (CanoeRental cr : canoeRentals) {
            if (cr.getName().equals(name) && isActive(cr)) {
                result = cr;
            }
        }if( result ==null){
            throw new IllegalArgumentException("Canoerental" + name + "doesn't exist");
        }
        return result;

    }

    public boolean isActive(CanoeRental cr){
        return (cr.endTime == null);
    }

    public CanoeRental closeRentalByName(String name, LocalDateTime endTime){
        CanoeRental foundRental = findRentalByName(name);
        foundRental.setEndTime(endTime);
        return foundRental;
    }

    double getRentalPriceByName(String name, LocalDateTime endTime){
        CanoeRental foundRental = findRentalByName(name);
        closeRentalByName(name, endTime);
        double duration = foundRental.calculateRentalSum();
        return 5000 * duration * foundRental.getCanoeType().getValue();
    }

    public List<CanoeRental> listClosedRentals() {
        List<CanoeRental> closedRentals = new ArrayList<>();
        for (CanoeRental item : canoeRentals) {
           if(!isActive(item)){
               closedRentals.add(item);
            }
        }
        Collections.sort(closedRentals);
        return closedRentals;
    }

    public Map<CanoeType, Integer> countRentals() {
        Map<CanoeType, Integer> canoeStatistics = new HashMap<>();
        for (CanoeRental item : canoeRentals) {
            if (!canoeStatistics.containsKey(item.getCanoeType())) {
                canoeStatistics.put(item.getCanoeType(), 0);
            }
            canoeStatistics.put(item.getCanoeType(), canoeStatistics.get(item.getCanoeType()) + 1);
        }
        return canoeStatistics;
    }





    public static void main(String[] args) {
        List<CanoeRental> canoeRentals = new ArrayList<>();
        CanoeOffice co = new CanoeOffice(canoeRentals);

        CanoeRental c1 = new CanoeRental("A", CanoeType.RED, LocalDateTime.of(2021, 2, 15, 8, 10));
        CanoeRental c2 = new CanoeRental("B", CanoeType.RED, LocalDateTime.of(2021, 2, 14, 8, 30));
        CanoeRental c3 = new CanoeRental("C", CanoeType.GREEN, LocalDateTime.of(2021, 2, 14, 8, 00));
        CanoeRental c4 = new CanoeRental("D", CanoeType.BLUE, LocalDateTime.of(2021, 2, 15, 9, 00));
        CanoeRental c5 = new CanoeRental("E", CanoeType.BLUE, LocalDateTime.of(2021, 2, 15, 10, 00));

        canoeRentals.add(c1);
        canoeRentals.add(c2);
        canoeRentals.add(c3);
        canoeRentals.add(c4);
        canoeRentals.add(c5);

        System.out.println(canoeRentals);

        System.out.println(co.findRentalByName("C"));

        System.out.println(co.listClosedRentals());

        System.out.println(co.countRentals());

    }

}