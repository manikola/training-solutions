package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private final List<String> composer;
    private int length;
    private final List<String> performers;
    private String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        if (length <= 0) {
            throw new IllegalArgumentException("Invalid length");
        }
        this.length = length;
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("Performers can not be empty");
        }
        this.performers = performers;
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Title can not be empty");
        }
        this.title = title;
        this.composer = new ArrayList<>();
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        if (Validators.isEmpty(composer)) {
            throw new IllegalArgumentException("Composer can not be empty");
        }
        this.composer = composer;
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("Performers can not be empty");
        }
        this.length = length;
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("Performers can not be empty");
        }
        this.performers = performers;
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Title can not be empty");
        }
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (String item : composer) {
            contributors.add(item);
        }
        for (String item : performers) {
            contributors.add(item);
        }
        return contributors;

    }
}
