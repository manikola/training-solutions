package week12d02;

import java.util.ArrayList;
import java.util.List;

public class Street {

    private List<Site> sites = new ArrayList<>();
    private List<SiteStatistic> statistics = new ArrayList<>();

    public List<Site> getSites() {
        return new ArrayList<>(sites);
    }

    public List<SiteStatistic> getStatistics() {
        return new ArrayList<>(statistics);
    }

    public void sellSite(Site site) {
        sites.add(site);
    }

    public int getHouseNumber() {
        int count = 0;
        int houseNumber = 0;
        Site lastHouse = sites.get(sites.size() - 1);
        for (Site item : sites) {
            if (item.isSideEven()) {
                count++;
            }
        }


            if (lastHouse.isSideEven()) {
                houseNumber = count * 2;
            }
            if (!lastHouse.isSideEven()) {
                houseNumber = (sites.size() - count) * 2 - 1;
            }

        return houseNumber;
    }

    public List<SiteStatistic> makeStatistics() {
        boolean found = false;
        for (Site item : sites) {
            for (SiteStatistic actual : statistics) {
                if (actual.getFenceType() == item.getFenceType()) {
                    actual.increaseCount();
                    found = true;
                    break;
                }
            }
            if (!found) {
                statistics.add(new SiteStatistic(item.getFenceType()));
            }
            found = false;
        }
        return statistics;
    }


}


