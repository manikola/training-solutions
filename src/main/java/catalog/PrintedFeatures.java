package catalog;


import java.util.List;

public class PrintedFeatures implements Feature {

    private List<String> authors;
    private int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if (Validators.isEmpty(authors)) {
            throw new IllegalArgumentException("Title can not be empty");
        }
        this.authors = authors;
        if (numberOfPages <= 0) {
            throw new IllegalArgumentException("Invalid number");
        }
        this.numberOfPages = numberOfPages;
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public List<String> getContributors() {
        return authors;
    }

}
