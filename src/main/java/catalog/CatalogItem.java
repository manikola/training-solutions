package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    List<Feature> features = new ArrayList<>();
    private final int price;
    private final String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.features.addAll(Arrays.asList(features));
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int fullLengthAtOneItem() {
        int count = 0;
        for (Feature item : features) {
            if (item instanceof AudioFeatures) {
                count += ((AudioFeatures) item).getLength();
            }

        }
        return count;
    }

    public List<String> getContributors() {
        List<String> newContributors = new ArrayList<>();
        for (Feature item : features) {
            newContributors.addAll(item.getContributors());
        }
        return newContributors;


    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature item : features) {
            titles.add(item.getTitle());
        }
        return titles;

    }

    public boolean hasAudioFeature() {
        for (Feature item : features) {
            if (item instanceof AudioFeatures) {
                return true;
            }

        }
        return false;

    }

    public boolean hasPrintedFeature() {
        for (Feature item : features) {
            if (item instanceof PrintedFeatures) {
                return true;
            }

        }
        return false;

    }

    public int numberOfPagesAtOneItem() {
        int numberOfPages = 0;
        for (Feature item : features) {
            if (item instanceof PrintedFeatures) {
                numberOfPages += ((PrintedFeatures) item).getNumberOfPages();
            }
        }
        return numberOfPages;

    }

}
